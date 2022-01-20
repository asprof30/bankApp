package com.androidapp.bankapp;

import java.util.Date;

public class Transaction {
    int imageId;
    String operation;
    String montants;
    String date;

    public Transaction(int imageId, String operation, String montants, String date) {
        this.imageId = imageId;
        this.operation = operation;
        this.montants = montants;
        this.date = date;
    }

    public int getImageId() {
        return imageId;
    }

    public String getOperation() {
        return operation;
    }

    public String getMontants() {
        return montants;
    }

    public String getDate() {
        return date;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setMontants(String montants) {
        this.montants = montants;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
