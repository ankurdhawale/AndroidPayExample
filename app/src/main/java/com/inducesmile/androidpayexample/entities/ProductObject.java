package com.inducesmile.androidpayexample.entities;


public class ProductObject {

    private int serviceId;

    private String serviceName;

    private int serviceImage;

    private String serviceDescription;

    private double productPrice;

    private int productSize;

    private String productColor;

    public ProductObject(int serviceId, String serviceName, int serviceImage, String serviceDescription, double productPrice, int productSize, String productColor) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceImage = serviceImage;
        this.serviceDescription = serviceDescription;
        this.productPrice = productPrice;
        this.productSize = productSize;
        this.productColor = productColor;
    }

    public int getProductId() {
        return serviceId;
    }

    public String getProductName() {
        return serviceName;
    }

    public int getProductImage() {
        return serviceImage;
    }

    public String getProductDescription() {
        return serviceDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductSize() {
        return productSize;
    }

    public String getProductColor() {
        return productColor;
    }

    @Override
    public String toString() {
        return "Service id and name: " + serviceId + " " + serviceName;
    }
}
