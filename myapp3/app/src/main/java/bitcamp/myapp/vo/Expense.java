package bitcamp.myapp.vo;

import bitcamp.myapp.util.ArrayList;

import java.util.Objects;

public class Expense {

    private static int seqNo;

    private int no;
    private String title;
    private String description;
    private String transactionDate;
    private String endDate;
    private ArrayList members = new ArrayList();

    public Expense() {

    }

    public Expense(int no) {
        this.no = no;
    }

    public static int getNextSeqNo() {
        return ++seqNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expense expense = (Expense) o;
        return no == expense.no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList getMembers() {
        return members;
    }
}
