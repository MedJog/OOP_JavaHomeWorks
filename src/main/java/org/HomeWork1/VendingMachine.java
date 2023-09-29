package org.HomeWork1;

import java.util.List;

public class VendingMachine {

        private List<Product> products;

        public VendingMachine(List<Product> products) {
            this.products = products;
        }


        public Medicines getMedicines(String name, double dose){
            for (Product product : products){
                if (product instanceof Medicines){
                    Medicines medicines = (Medicines) product;
                    if (medicines.getName() == name && medicines.getDose() == dose){
                        return medicines;
                    }
                }
            }
            return null;
        }

    public ExternalMeans getExternalMeans(String name, String dosageForm, double volume ){
        for (Product product : products){
            if (product instanceof ExternalMeans){
                ExternalMeans externalMeans = (ExternalMeans) product;
                if (externalMeans.getName() == name && externalMeans.getDosageForm() == dosageForm && externalMeans.getVolume() == volume){
                    return externalMeans;
                }
            }
        }
        return null;
    }

}
