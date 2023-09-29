package org.HomeWork1;

public class Medicines extends Product{

 private String dosageForm; // лекарственная форма
 private double dose;       // дозировка

    public String getDosageForm() {
        return dosageForm;
    }
    public void SetDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public double getDose(){
        return dose;
    }
    public void SetDose(double dose){
        this.dose = dose;
    }
public Medicines(String brand, String name, double price, String dosageForm, double dose) {
    super(brand, name, price);
    this.dosageForm = dosageForm;
    this.dose = dose;
}
    @Override
    public String displayInfo() {
        return String.format("Производитель: %s. Наименование: %s. Цена: %.2f. Лекарственная форма: %s. Дозировка: %.1f mg."
                , brand, name, price, dosageForm, dose);
    }


}
