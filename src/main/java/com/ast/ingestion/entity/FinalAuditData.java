package com.ast.ingestion.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "final_audit_data")
@ToString
public class FinalAuditData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "client_id")
    private String client_id;
    @Column(name = "carrier_name")
    private String carrier_name;
    @Column(name = "inv_bill_to_company")
    private String inv_bill_to_company;
    @Column(name = "inv_account_number")
    private String inv_account_number;
    @Column(name = "inv_invoice_number")
    private String inv_invoice_number;
    @Column(name = "inv_invoice_date")
    private String inv_invoice_date;
    @Column(name = "inv_tracking_id")
    private String inv_tracking_id;
    @Column(name = "inv_origin_center")
    private String inv_origin_center;
    @Column(name = "inv_package_type")
    private String inv_package_type;
    @Column(name = "inv_cod_amount")
    private String inv_cod_amount;
    @Column(name = "inv_shipmethod")
    private String inv_shipmethod;
    @Column(name = "inv_zone")
    private String inv_zone;
    @Column(name = "inv_pickup_date")
    private String inv_pickup_date;
    @Column(name = "inv_pickup_pincode")
    private String inv_pickup_pincode;
    @Column(name = "inv_delivery_date")
    private String inv_delivery_date;
    @Column(name = "inv_delivery_pincode")
    private String inv_delivery_pincode;
    @Column(name = "inv_delivery_station")
    private String inv_delivery_station;
    @Column(name = "inv_noi")
    private String inv_noi;
    @Column(name = "inv_bill_wt")
    private Double inv_bill_wt;
    @Column(name = "inv_scale_wt")
    private Double inv_scale_wt;
    @Column(name = "inv_lbh")
    private String inv_lbh;
    @Column(name = "inv_remarks")
    private String inv_remarks;
    @Column(name = "inv_shipment_status")
    private String inv_shipment_status;
    @Column(name = "inv_courier_name")
    private String inv_courier_name;
    @Column(name = "inv_user_wt")
    private Double inv_user_wt;
    @Column(name = "inv_user_lbh")
    private String inv_user_lbh;
    @Column(name = "inv_cc")
    private String inv_cc;
    @Column(name = "inv_cc_amnt")
    private Double inv_cc_amnt;
    @Column(name = "inv_rc_amnt")
    private Double inv_rc_amnt;
    @Column(name = "mfst_rc_amnt")
    private Double mfst_rc_amnt;
    @Column(name = "mfst_cc_amnt")
    private Double mfst_cc_amnt;
    @Column(name = "om_mfstactuals_amnt")
    private Double om_mfstactuals_amnt;
    @Column(name = "om_invrcestimates_amnt")
    private Double om_invrcestimates_amnt;
    @Column(name = "om_mfstrcestimates_amnt")
    private Double om_mfstrcestimates_amnt;
    @Column(name = "mfst_bill_to_company")
    private String mfst_bill_to_company;

    @Column(name = "mfst_ship_from_company")
    private String mfst_ship_from_company;
    @Column(name = "mfst_consignee_name")
    private String mfst_consignee_name;
    @Column(name = "mfst_number")
    private String mfst_number;
    @Column(name = "mfst_date")
    private String mfst_date;
    @Column(name = "mfst_ship_from_state")
    private String mfst_ship_from_state;
    @Column(name = "mfst_delivery_state")
    private String mfst_delivery_state;
    @Column(name = "mfst_noi")
    private String mfst_noi;
    @Column(name = "mfst_scale_wt")
    private String mfst_scale_wt;
    @Column(name = "mfst_delivery_date")
    private String mfst_delivery_date;
    @Column(name = "mfst_delivery_pincode")
    private String mfst_delivery_pincode;
    @Column(name = "mfst_oda_dist")
    private String mfst_oda_dist;
    @Column(name = "mfst_zone")
    private String mfst_zone;

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

    public Double getInv_bill_wt() {
        return inv_bill_wt;
    }

    public void setInv_bill_wt(Double inv_bill_wt) {
        this.inv_bill_wt = inv_bill_wt;
    }

    public Double getInv_scale_wt() {
        return inv_scale_wt;
    }

    public void setInv_scale_wt(Double inv_scale_wt) {
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

    public Double getInv_user_wt() {
        return inv_user_wt;
    }

    public void setInv_user_wt(Double inv_user_wt) {
        this.inv_user_wt = inv_user_wt;
    }

    public String getInv_user_lbh() {
        return inv_user_lbh;
    }

    public void setInv_user_lbh(String inv_user_lbh) {
        this.inv_user_lbh = inv_user_lbh;
    }

    public String getInv_cc() {
        return inv_cc;
    }

    public void setInv_cc(String inv_cc) {
        this.inv_cc = inv_cc;
    }

    public Double getInv_cc_amnt() {
        return inv_cc_amnt;
    }

    public void setInv_cc_amnt(Double inv_cc_amnt) {
        this.inv_cc_amnt = inv_cc_amnt;
    }

    public Double getInv_rc_amnt() {
        return inv_rc_amnt;
    }

    public void setInv_rc_amnt(Double inv_rc_amnt) {
        this.inv_rc_amnt = inv_rc_amnt;
    }

    public Double getMfst_rc_amnt() {
        return mfst_rc_amnt;
    }

    public void setMfst_rc_amnt(Double mfst_rc_amnt) {
        this.mfst_rc_amnt = mfst_rc_amnt;
    }

    public Double getMfst_cc_amnt() {
        return mfst_cc_amnt;
    }

    public void setMfst_cc_amnt(Double mfst_cc_amnt) {
        this.mfst_cc_amnt = mfst_cc_amnt;
    }

    public Double getOm_mfstactuals_amnt() {
        return om_mfstactuals_amnt;
    }

    public void setOm_mfstactuals_amnt(Double om_mfstactuals_amnt) {
        this.om_mfstactuals_amnt = om_mfstactuals_amnt;
    }

    public Double getOm_invrcestimates_amnt() {
        return om_invrcestimates_amnt;
    }

    public void setOm_invrcestimates_amnt(Double om_invrcestimates_amnt) {
        this.om_invrcestimates_amnt = om_invrcestimates_amnt;
    }

    public Double getOm_mfstrcestimates_amnt() {
        return om_mfstrcestimates_amnt;
    }

    public void setOm_mfstrcestimates_amnt(Double om_mfstrcestimates_amnt) {
        this.om_mfstrcestimates_amnt = om_mfstrcestimates_amnt;
    }

    public String getMfst_bill_to_company() {
        return mfst_bill_to_company;
    }

    public void setMfst_bill_to_company(String mfst_bill_to_company) {
        this.mfst_bill_to_company = mfst_bill_to_company;
    }

    public String getMfst_ship_from_company() {
        return mfst_ship_from_company;
    }

    public void setMfst_ship_from_company(String mfst_ship_from_company) {
        this.mfst_ship_from_company = mfst_ship_from_company;
    }

    public String getMfst_consignee_name() {
        return mfst_consignee_name;
    }

    public void setMfst_consignee_name(String mfst_consignee_name) {
        this.mfst_consignee_name = mfst_consignee_name;
    }

    public String getMfst_number() {
        return mfst_number;
    }

    public void setMfst_number(String mfst_number) {
        this.mfst_number = mfst_number;
    }

    public String getMfst_date() {
        return mfst_date;
    }

    public void setMfst_date(String mfst_date) {
        this.mfst_date = mfst_date;
    }

    public String getMfst_ship_from_state() {
        return mfst_ship_from_state;
    }

    public void setMfst_ship_from_state(String mfst_ship_from_state) {
        this.mfst_ship_from_state = mfst_ship_from_state;
    }

    public String getMfst_delivery_state() {
        return mfst_delivery_state;
    }

    public void setMfst_delivery_state(String mfst_delivery_state) {
        this.mfst_delivery_state = mfst_delivery_state;
    }

    public String getMfst_noi() {
        return mfst_noi;
    }

    public void setMfst_noi(String mfst_noi) {
        this.mfst_noi = mfst_noi;
    }

    public String getMfst_scale_wt() {
        return mfst_scale_wt;
    }

    public void setMfst_scale_wt(String mfst_scale_wt) {
        this.mfst_scale_wt = mfst_scale_wt;
    }

    public String getMfst_delivery_date() {
        return mfst_delivery_date;
    }

    public void setMfst_delivery_date(String mfst_delivery_date) {
        this.mfst_delivery_date = mfst_delivery_date;
    }

    public String getMfst_delivery_pincode() {
        return mfst_delivery_pincode;
    }

    public void setMfst_delivery_pincode(String mfst_delivery_pincode) {
        this.mfst_delivery_pincode = mfst_delivery_pincode;
    }

    public String getMfst_oda_dist() {
        return mfst_oda_dist;
    }

    public void setMfst_oda_dist(String mfst_oda_dist) {
        this.mfst_oda_dist = mfst_oda_dist;
    }

    public String getMfst_zone() {
        return mfst_zone;
    }

    public void setMfst_zone(String mfst_zone) {
        this.mfst_zone = mfst_zone;
    }
}
