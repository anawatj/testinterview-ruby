package com.tao;
import java.util.List;
import  java.util.stream.Collectors;
import java.time.temporal.ChronoUnit;
public class Invoice {
    private int id;
    private double amount;
    private LocalDate due_date;
    private LocalDate paid_date;

    public Invoice(int id, double amount, LocalDate due_date, LocalDate paid_date) {
        this.id = id;
        this.amount = amount;
        this.due_date = due_date;
        this.paid_date = paid_date;
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, 100, LocalDate.parse("2023-04-15", formatter), null));
        invoices.add(new Invoice(2, 200, LocalDate.parse("2023-05-01", formatter), null));
        invoices.add(new Invoice(3, 150, LocalDate.parse("2023-04-30", formatter), LocalDate.parse("2023-05-05", formatter)));
        invoices.add(new Invoice(4, 300, LocalDate.parse("2023-04-01", formatter), LocalDate.parse("2023-04-30", formatter)));
       // System.out.println(getOverdueInvoices(invoices));
    }
    public List<Invoice> getOverdueInvoices(List<Invoice> invoices){
      List<Invoice> result=  invoices.stream()
        .filter(a->DAYS.between(a.paid_date, a.due_date)<0)
        .collect(Collectors.toList());
      return result;
    }
}