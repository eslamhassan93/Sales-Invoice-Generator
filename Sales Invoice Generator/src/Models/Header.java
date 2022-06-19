package Models;

import java.util.ArrayList;
import java.util.Date;

public class Header {
    
        private int invoiceNumber;
        private Date invoiceDate;
        private String cutomer;
        private ArrayList<Items> lines;

        public Header() {
        }

        public Header(int invoiceNumber, Date invoiceDate, String cutomer) {
            this.invoiceNumber = invoiceNumber;
            this.invoiceDate = invoiceDate;
            this.cutomer = cutomer;
        }

        public int getInvoiceNumber() {
            return invoiceNumber;
        }

        public Date getInvoiceDate() {
            return invoiceDate;
        }

        public String getCutomer() {
            return cutomer;
        }

        public void setInvoiceNumber(int invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        public void setInvoiceDate(Date invoiceDate) {
            this.invoiceDate = invoiceDate;
        }

        public void setCutomer(String cutomer) {
            this.cutomer = cutomer;
        }

        public void setLines(ArrayList<Items> lines) {
            this.lines = lines;
        }

        public ArrayList<Items> getLines() {
            if (lines == null){
                lines = new ArrayList<>();
            }
            return lines;
        }

        public double getTotal() {
            double total = 0.0;
            for (int i=0 ; i < getLines().size() ; i++ ){
                total += getLines().get(i).getItemTotal();
            }
            return total;
        }

        @Override
        public String toString() {
            Object ActionsListener;
            return invoiceNumber + "," + ActionsListener.simpleDateFormat.format(invoiceDate) + "," + cutomer;
        }
}
