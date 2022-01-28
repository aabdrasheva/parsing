import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class ReadTableWord {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Асия\\Desktop\\1.docx");
        FileInputStream fis = new FileInputStream(file);
        XWPFDocument doc = new XWPFDocument(fis);
        List<XWPFTable> tables = doc.getTables();
    
        System.out.println("\n\nGet string from Table");
        int count = 1;
        for (XWPFTable table : tables) {
            System.out.println("\n\nTable" + count);
            count++;
            for (XWPFTableRow row : table.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    System.out.print(cell.getText() + " ");
                }
                System.out.println(" ");
            }
        }
    }
}