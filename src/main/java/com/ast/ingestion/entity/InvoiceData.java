package com.ast.ingestion.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "invoice_data")
@ToString
public class InvoiceData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "client_id" )
    private String client_id;

    @Column(name = "carrier_name" )
    private String carrier_name;
    @Column(name = "inv_bill_to_company" )
    private String inv_bill_to_company;
    @Column(name = "inv_account_number" )
    private String inv_account_number;
    @Column(name = "inv_invoice_number" )
    private String inv_invoice_number;
    @Column(name = "inv_invoice_date" )
    private String inv_invoice_date;
    @Column(name = "inv_tracking_id" )
    private String inv_tracking_id;
    @Column(name = "inv_origin_center" )
    private String inv_origin_center;
    @Column(name = "inv_package_type" )
    private String inv_package_type;
    @Column(name = "inv_cod_amount" )
    private String inv_cod_amount;
    @Column(name = "inv_shipmethod" )
    private String inv_shipmethod;
    @Column(name = "inv_zone" )
    private String inv_zone;
    @Column(name = "inv_pickup_date" )
    private String inv_pickup_date;
    @Column(name = "inv_pickup_pincode" )
    private String inv_pickup_pincode;
    @Column(name = "inv_delivery_date" )
    private String inv_delivery_date;
    @Column(name = "inv_delivery_pincode" )
    private String inv_delivery_pincode;
    @Column(name = "inv_delivery_station" )
    private String inv_delivery_station;
    @Column(name = "inv_noi" )
    private String inv_noi;
    @Column(name = "inv_bill_wt" )
    private String inv_bill_wt;
    @Column(name = "inv_scale_wt" )
    private String inv_scale_wt;
    @Column(name = "inv_lbh" )
    private String inv_lbh;
    @Column(name = "inv_remarks" )
    private String inv_remarks;
    @Column(name = "inv_shipment_status" )
    private String inv_shipment_status;
    @Column(name = "inv_courier_name" )
    private String inv_courier_name;
    @Column(name = "inv_user_wt" )
    private String inv_user_wt;
    @Column(name = "inv_user_lbh" )
    private String inv_user_lbh;
    @Column(name = "FRT" )
    private String FRT;
    @Column(name = "COD" )
    private String COD;
    @Column(name = "RTO" )
    private String RTO;
    @Column(name = "Pre_Tax_Total" )
    private String Pre_Tax_Total;
    @Column(name = "IGST" )
    private String IGST;
    @Column(name = "CGST" )
    private String CGST;
    @Column(name = "SGST" )
    private String SGST;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getCarrier_name() {
        return carrier_name;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public String getInv_bill_to_company() {
        return inv_bill_to_company;
    }

    public void setInv_bill_to_company(String inv_bill_to_company) {
        this.inv_bill_to_company = inv_bill_to_company;
    }

    public String getInv_account_number() {
        return inv_account_number;
    }

    public void setInv_account_number(String inv_account_number) {
        this.inv_account_number = inv_account_number;
    }

    public String getInv_invoice_number() {
        return inv_invoice_number;
    }

    public void setInv_invoice_number(String inv_invoice_number) {
        this.inv_invoice_number = inv_invoice_number;
    }

    public String getInv_invoice_date() {
        return inv_invoice_date;
    }

    public void setInv_invoice_date(String inv_invoice_date) {
        this.inv_invoice_date = inv_invoice_date;
    }

    public String getInv_tracking_id() {
        return inv_tracking_id;
    }

    public void setInv_tracking_id(String inv_tracking_id) {
        this.inv_tracking_id = inv_tracking_id;
    }

    public String getInv_origin_center() {
        return inv_origin_center;
    }

    public void setInv_origin_center(String inv_origin_center) {
        this.inv_origin_center = inv_origin_center;
    }

    public String getInv_package_type() {
        return inv_package_type;
    }

    public void setInv_package_type(String inv_package_type) {
        this.inv_package_type = inv_package_type;
    }

    public String getInv_cod_amount() {
        return inv_cod_amount;
    }

    public void setInv_cod_amount(String inv_cod_amount) {
        this.inv_cod_amount = inv_cod_amount;
    }

    public String getInv_shipmethod() {
        return inv_shipmethod;
    }

    public void setInv_shipmethod(String inv_shipmethod) {
        this.inv_shipmethod = inv_shipmethod;
    }

    public String getInv_zone() {
        return inv_zone;
    }

    public void setInv_zone(String inv_zone) {
        this.inv_zone = inv_zone;
    }

    public String getInv_pickup_date() {
        return inv_pickup_date;
    }

    public void setInv_pickup_date(String inv_pickup_date) {
        this.inv_pickup_date = inv_pickup_date;
    }

    public String getInv_pickup_pincode() {
        return inv_pickup_pincode;
    }

    public void setInv_pickup_pincode(String inv_pickup_pincode) {
        this.inv_pickup_pincode = inv_pickup_pincode;
    }

    public String getInv_delivery_date() {
        return inv_delivery_date;
    }

    public void setInv_delivery_date(String inv_delivery_date) {
        this.inv_delivery_date = inv_delivery_date;
    }

    public String getInv_delivery_pincode() {
        return inv_delivery_pincode;
    }

    public void setInv_delivery_pincode(String inv_delivery_pincode) {
        this.inv_delivery_pincode = inv_delivery_pincode;
    }

    public String getInv_delivery_station() {
        return inv_delivery_station;
    }

    public void setInv_delivery_station(String inv_delivery_station) {
        this.inv_delivery_station = inv_delivery_station;
    }

    public String getInv_noi() {
        return inv_noi;
    }

    public void setInv_noi(String inv_noi) {
        this.inv_noi = inv_noi;
    }

    public String getInv_bill_wt() {
        return inv_bill_wt;
    }

    public void setInv_bill_wt(String inv_bill_wt) {
        this.inv_bill_wt = inv_bill_wt;
    }

    public String getInv_scale_wt() {
        return inv_scale_wt;
    }

    public void setInv_scale_wt(String inv_scale_wt) {
        this.inv_scale_wt = inv_scale_wt;
    }

    public String getInv_lbh() {
        return inv_lbh;
    }

    public void setInv_lbh(String inv_lbh) {
        this.inv_lbh = inv_lbh;
    }

    public String getInv_remarks() {
        return inv_remarks;
    }

    public void setInv_remarks(String inv_remarks) {
        this.inv_remarks = inv_remarks;
    }

    public String getInv_shipment_status() {
        return inv_shipment_status;
    }

    public void setInv_shipment_status(String inv_shipment_status) {
        this.inv_shipment_status = inv_shipment_status;
    }

    public String getInv_courier_name() {
        return inv_courier_name;
    }

    public void setInv_courier_name(String inv_courier_name) {
        this.inv_courier_name = inv_courier_name;
    }

    public String getInv_user_wt() {
        return inv_user_wt;
    }

    public void setInv_user_wt(String inv_user_wt) {
        this.inv_user_wt = inv_user_wt;
    }

    public String getInv_user_lbh() {
        return inv_user_lbh;
    }

    public void setInv_user_lbh(String inv_user_lbh) {
        this.inv_user_lbh = inv_user_lbh;
    }

    public String getFRT() {
        return FRT;
    }

    public void setFRT(String FRT) {
        this.FRT = FRT;
    }

    public String getCOD() {
        return COD;
    }

    public void setCOD(String COD) {
        this.COD = COD;
    }

    public String getRTO() {
        return RTO;
    }

    public void setRTO(String RTO) {
        this.RTO = RTO;
    }

    public String getPre_Tax_Total() {
        return Pre_Tax_Total;
    }

    public void setPre_Tax_Total(String pre_Tax_Total) {
        Pre_Tax_Total = pre_Tax_Total;
    }

    public String getIGST() {
        return IGST;
    }

    public void setIGST(String IGST) {
        this.IGST = IGST;
    }

    public String getCGST() {
        return CGST;
    }

    public void setCGST(String CGST) {
        this.CGST = CGST;
    }

    public String getSGST() {
        return SGST;
    }

    public void setSGST(String SGST) {
        this.SGST = SGST;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    @Column(name = "Total" )
    private String Total;


}
