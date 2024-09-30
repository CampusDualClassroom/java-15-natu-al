package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getSpecificData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(expirationDate);

        StringBuilder details = new StringBuilder();

        details.append("Producto: ").append(getName()).append("\n")
                .append("ID único: ").append(getUniqueId()).append("\n")
                .append("Responsable ID: ").append(getResponsibleId()).append("\n")
                .append("Ubicación: ").append(getLocation()).append("\n")
                .append("Cantidad: ").append(getQuantity()).append("\n")
                .append("Fecha de caducidad: ").append(date);

        return details.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }


}
