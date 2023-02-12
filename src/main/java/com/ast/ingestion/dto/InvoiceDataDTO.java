package com.ast.ingestion.dto;

public class InvoiceDataDTO extends AbstractDTO<Integer> {
    private Integer id;
    private String client_id;
    private String carrier_name;
    private String inv_bill_to_company;
    private String inv_account_number;
    private String inv_invoice_number;
    private String inv_invoice_date;
    private String inv_tracking_id;
    private String inv_origin_center;
    private String inv_package_type;
    private String inv_cod_amount;
    private String inv_shipmethod;
    private String inv_zone;
    private String inv_pickup_date;
    private String inv_pickup_pincode;
    private String inv_delivery_date;
    private String inv_delivery_pincode;
    private String inv_delivery_station;
    private String inv_noi;
    private String inv_bill_wt;
    private String inv_scale_wt;
    private String inv_lbh;
    private String inv_remarks;
    private String inv_shipment_status;
    private String inv_courier_name;
    private String inv_user_wt;
    private String inv_user_lbh;
    private String FRT;
    private String COD;
    private String RTO;
    private String Pre_Tax_Total;
    private String IGST;
    private String CGST;
    private String SGST;
    private String Total;

    public InvoiceDataDTO() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_id() {
        return this.client_id;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public String getCarrier_name() {
        return this.carrier_name;
    }

    public void setInv_bill_to_company(String inv_bill_to_company) {
        this.inv_bill_to_company = inv_bill_to_company;
    }

    public String getInv_bill_to_company() {
        return this.inv_bill_to_company;
    }

    public void setInv_account_number(String inv_account_number) {
        this.inv_account_number = inv_account_number;
    }

    public String getInv_account_number() {
        return this.inv_account_number;
    }

    public void setInv_invoice_number(String inv_invoice_number) {
        this.inv_invoice_number = inv_invoice_number;
    }

    public String getInv_invoice_number() {
        return this.inv_invoice_number;
    }

    public void setInv_invoice_date(String inv_invoice_date) {
        this.inv_invoice_date = inv_invoice_date;
    }

    public String getInv_invoice_date() {
        return this.inv_invoice_date;
    }

    public void setInv_tracking_id(String inv_tracking_id) {
        this.inv_tracking_id = inv_tracking_id;
    }

    public String getInv_tracking_id() {
        return this.inv_tracking_id;
    }

    public void setInv_origin_center(String inv_origin_center) {
        this.inv_origin_center = inv_origin_center;
    }

    public String getInv_origin_center() {
        return this.inv_origin_center;
    }

    public void setInv_package_type(String inv_package_type) {
        this.inv_package_type = inv_package_type;
    }

    public String getInv_package_type() {
        return this.inv_package_type;
    }

    public void setInv_cod_amount(String inv_cod_amount) {
        this.inv_cod_amount = inv_cod_amount;
    }

    public String getInv_cod_amount() {
        return this.inv_cod_amount;
    }

    public void setInv_shipmethod(String inv_shipmethod) {
        this.inv_shipmethod = inv_shipmethod;
    }

    public String getInv_shipmethod() {
        return this.inv_shipmethod;
    }

    public void setInv_zone(String inv_zone) {
        this.inv_zone = inv_zone;
    }

    public String getInv_zone() {
        return this.inv_zone;
    }

    public void setInv_pickup_date(String inv_pickup_date) {
        this.inv_pickup_date = inv_pickup_date;
    }

    public String getInv_pickup_date() {
        return this.inv_pickup_date;
    }

    public void setInv_pickup_pincode(String inv_pickup_pincode) {
        this.inv_pickup_pincode = inv_pickup_pincode;
    }

    public String getInv_pickup_pincode() {
        return this.inv_pickup_pincode;
    }

    public void setInv_delivery_date(String inv_delivery_date) {
        this.inv_delivery_date = inv_delivery_date;
    }

    public String getInv_delivery_date() {
        return this.inv_delivery_date;
    }

    public void setInv_delivery_pincode(String inv_delivery_pincode) {
        this.inv_delivery_pincode = inv_delivery_pincode;
    }

    public String getInv_delivery_pincode() {
        return this.inv_delivery_pincode;
    }

    public void setInv_delivery_station(String inv_delivery_station) {
        this.inv_delivery_station = inv_delivery_station;
    }

    public String getInv_delivery_station() {
        return this.inv_delivery_station;
    }

    public void setInv_noi(String inv_noi) {
        this.inv_noi = inv_noi;
    }

    public String getInv_noi() {
        return this.inv_noi;
    }

    public void setInv_bill_wt(String inv_bill_wt) {
        this.inv_bill_wt = inv_bill_wt;
    }

    public String getInv_bill_wt() {
        return this.inv_bill_wt;
    }

    public void setInv_scale_wt(String inv_scale_wt) {
        this.inv_scale_wt = inv_scale_wt;
    }

    public String getInv_scale_wt() {
        return this.inv_scale_wt;
    }

    public void setInv_lbh(String inv_lbh) {
        this.inv_lbh = inv_lbh;
    }

    public String getInv_lbh() {
        return this.inv_lbh;
    }

    public void setInv_remarks(String inv_remarks) {
        this.inv_remarks = inv_remarks;
    }

    public String getInv_remarks() {
        return this.inv_remarks;
    }

    public void setInv_shipment_status(String inv_shipment_status) {
        this.inv_shipment_status = inv_shipment_status;
    }

    public String getInv_shipment_status() {
        return this.inv_shipment_status;
    }

    public void setInv_courier_name(String inv_courier_name) {
        this.inv_courier_name = inv_courier_name;
    }

    public String getInv_courier_name() {
        return this.inv_courier_name;
    }

    public void setInv_user_wt(String inv_user_wt) {
        this.inv_user_wt = inv_user_wt;
    }

    public String getInv_user_wt() {
        return this.inv_user_wt;
    }

    public void setInv_user_lbh(String inv_user_lbh) {
        this.inv_user_lbh = inv_user_lbh;
    }

    public String getInv_user_lbh() {
        return this.inv_user_lbh;
    }

    public void setFRT(String FRT) {
        this.FRT = FRT;
    }

    public String getFRT() {
        return this.FRT;
    }

    public void setCOD(String COD) {
        this.COD = COD;
    }

    public String getCOD() {
        return this.COD;
    }

    public void setRTO(String RTO) {
        this.RTO = RTO;
    }

    public String getRTO() {
        return this.RTO;
    }

    public void setPre_Tax_Total(String Pre_Tax_Total) {
        this.Pre_Tax_Total = Pre_Tax_Total;
    }

    public String getPre_Tax_Total() {
        return this.Pre_Tax_Total;
    }

    public void setIGST(String IGST) {
        this.IGST = IGST;
    }

    public String getIGST() {
        return this.IGST;
    }

    public void setCGST(String CGST) {
        this.CGST = CGST;
    }

    public String getCGST() {
        return this.CGST;
    }

    public void setSGST(String SGST) {
        this.SGST = SGST;
    }

    public String getSGST() {
        return this.SGST;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getTotal() {
        return this.Total;
    }
}