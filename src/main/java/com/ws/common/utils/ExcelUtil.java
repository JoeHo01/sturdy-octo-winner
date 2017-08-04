package com.ws.common.utils;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelUtil {

    public static void output(HttpServletResponse response, List<Map<String, String>> projects, String[] keys, String[] columnNames, String title) throws IOException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        createWorkBook(projects, keys, columnNames).write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName(title)).getBytes(), "iso-8859-1"));

        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(out);

        byte[] buff = new byte[2048];
        int bytesRead;
        // Simple read/write loop.
        while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
            bos.write(buff, 0, bytesRead);
        }

        bis.close();
        bos.close();
    }

    /**
     * 创建excel文档，
     *
     * @param projects 数据
     */
    private static Workbook createWorkBook(List<Map<String, String>> projects, String[] keys, String[] columnName) {
        List<Map<String, Object>> list = list(projects);
        // 创建excel工作簿
        Workbook wb = new HSSFWorkbook();
        // 创建第一个sheet（页），并命名
        Sheet sheet = wb.createSheet((String) list.get(0).get("sheetName"));
        // 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
        for (int i = 0; i < keys.length; i++) {
            sheet.setColumnWidth((short) i, (short) (35.7 * 150));
        }

        // 创建第一行
        Row row = sheet.createRow((short) 0);

        // 创建二种单元格格式
        CellStyle cs = wb.createCellStyle();
        CellStyle cs2 = wb.createCellStyle();

        // 创建二种字体
        Font f = wb.createFont();
        Font f2 = wb.createFont();

        // 创建第一种字体样式（用于列名）
        f.setFontHeightInPoints((short) 11);
        f.setColor(IndexedColors.BLACK.getIndex());
        // 创建第二种字体样式（用于值）
        f2.setFontHeightInPoints((short) 10);
        f2.setColor(IndexedColors.BLACK.getIndex());

        // 设置第一种单元格的样式（用于列名）
        cs.setFont(f);
        // 设置第二种单元格的样式（用于值）
        cs2.setFont(f2);

        //设置列名
        for (int i = 0; i < columnName.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(columnName[i]);
            cell.setCellStyle(cs);
        }
        //设置每行每列的值
        for (short i = 1; i < list.size(); i++) {
            // Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
            // 创建一行，在页sheet上
            Row row1 = sheet.createRow(i);
            // 在row行上创建一个方格
            for (short j = 0; j < keys.length; j++) {
                Cell cell = row1.createCell(j);
                cell.setCellValue(list.get(i).get(keys[j]) == null ? " " : list.get(i).get(keys[j]).toString());
                cell.setCellStyle(cs2);
            }
        }
        return wb;
    }

    private static List<Map<String, Object>> list(List<Map<String, String>> projects) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sheetName", "sheet1");
        listMap.add(map);
        for (Map<String, String> project : projects) {
            Map<String, Object> mapValue = new HashMap<String, Object>();
            Set<String> keys = project.keySet();
            for (String key : keys) {
                mapValue.put(key, project.get(key));
            }
            listMap.add(mapValue);
        }
        return listMap;
    }

    private static String fileName(String heading) {
        if (heading.contains(".xls")) return heading;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(new Date());
        return heading + " " + time + ".xls";
    }
}
