package com.androidapp.bankapp;

public class Transaction {
    private int imageId;
    private String operation;
    private int montant;
    private String date;

    public Transaction(int imageId, String operation, int montant, String date) {
        this.imageId = imageId;
        this.operation = operation;
        this.montant = montant;
        this.date = date;
    }

    public int getImageId() {
        return imageId;
    }

    public String getOperation() {
        return operation;
    }

    public int getMontant() {
        return montant;
    }

    public String getDate() {
        return date;
    }
}
