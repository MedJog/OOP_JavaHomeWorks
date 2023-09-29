package org.HomeWork1;

public class ExternalMeans extends Product{
    private String dosageForm; // лекарственная форма
    private double volume;      // объём
    private double concentration;       // концентрация

    public String getDosageForm() {
        return dosageForm;
    }
    public void SetDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }
    public double getVolume() {
        return volume;
    }
    public void SetVolume(double volume) {
        this.volume = volume;
    }
     public double getConcentration(){
        return concentration;
     }
     public void SetConcentration(double concentration){
        this.concentration = concentration;
     }
    public ExternalMeans(String brand, String name, double price, String dosageForm, double volume, double concentration ) {
        super(brand, name, price);
        this.dosageForm = dosageForm;
        this.volume = volume;
        this.concentration = concentration;
    }
    @Override
    public String displayInfo() {
        return String.format("Производитель: %s. Наименование: %s. Цена: %.2f. Лекарственная форма: %s. Объём: %.1f. Концентрация: %.1f."
                , brand, name, price, dosageForm, volume, concentration);
    }

}

