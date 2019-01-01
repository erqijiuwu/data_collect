package com.neat.data.house;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.neat.data.util.GeneralBooleanDeserializer;
import com.neat.data.util.GeneralBooleanSerializer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "property_details_basic")
public class PropertyDetailsBasicEntity {
    @Column(columnDefinition = "varchar(16)")
    private String userId;

    @Column(columnDefinition = "varchar(16)")
    private String dpId;

    @Column(columnDefinition = "varchar(256)")
    private String email;

    @Id
    @Column(columnDefinition = "varchar(16)")
    private String listingId;

    @Column(columnDefinition = "varchar(64)")
    private String title;

    @Column(columnDefinition = "varchar(64)")
    private String categoryLevel1;

    @Column(columnDefinition = "varchar(64)")
    private String categoryLevel2;

    @Column(columnDefinition = "varchar(64)")
    private String categoryLevel3;

    @Column(columnDefinition = "varchar(16)")
    private String mcat;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean newOrUsed;

    @Column(columnDefinition = "varchar(16)")
    private String auctionOrClassified;

    @Column(columnDefinition = "varchar(64)")
    private String sellerId;

    @Column(columnDefinition = "varchar(32)")
    private String sellerRegion;

    @Column(columnDefinition = "varchar(32)")
    private String sellerDistrict;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean sellerInTrade;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isBuyNow;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isPayNow;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isAfterpay;

    @Column(columnDefinition = "float")
    private float buyNowPrice;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean mustPickUp;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean freeShipping;

    @Column(columnDefinition = "varchar(256)")
    private String url;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isExpired;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean hasVideo;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean hasPhotos;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean tracked;

    @Column(columnDefinition = "varchar(32)")
    private String pageName;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isFeatured;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean isSuperFeatured;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean hasGtinCode;

    @Column(columnDefinition = "float")
    private float wasPrice;

    @Column(columnDefinition = "varchar(32)")
    private String businessLine;

    @Column(columnDefinition = "varchar(16)")
    private String band;

    @Column(columnDefinition = "varchar(64)")
    private String propertyType;

    @Column(columnDefinition = "varchar(32)")
    private String propertyRegion;

    @Column(columnDefinition = "varchar(32)")
    private String propertyDistrict;

    @Column(columnDefinition = "varchar(32)")
    private String propertySuburb;

    @Column(columnDefinition = "varchar(64)")
    private String propertyPriceType;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean propertyMapShown;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean propertyMapHasSchoolsView;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean propertyMapHasBoundaryView;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean propertyMapHasStreetView;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean jobsAgent;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean showLuckyOrange;

    @JsonSerialize(using = GeneralBooleanSerializer.class)
    @JsonDeserialize(using = GeneralBooleanDeserializer.class)
    @Column(columnDefinition = "boolean")
    private Boolean showLuckyOrangeInSell;

    @Column(columnDefinition = "varchar(64)")
    private String abTestEventId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(String categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public String getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(String categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(String categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public String getMcat() {
        return mcat;
    }

    public void setMcat(String mcat) {
        this.mcat = mcat;
    }

    public Boolean getNewOrUsed() {
        return newOrUsed;
    }

    public void setNewOrUsed(Boolean newOrUsed) {
        this.newOrUsed = newOrUsed;
    }

    public String getAuctionOrClassified() {
        return auctionOrClassified;
    }

    public void setAuctionOrClassified(String auctionOrClassified) {
        this.auctionOrClassified = auctionOrClassified;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerRegion() {
        return sellerRegion;
    }

    public void setSellerRegion(String sellerRegion) {
        this.sellerRegion = sellerRegion;
    }

    public String getSellerDistrict() {
        return sellerDistrict;
    }

    public void setSellerDistrict(String sellerDistrict) {
        this.sellerDistrict = sellerDistrict;
    }

    public Boolean getSellerInTrade() {
        return sellerInTrade;
    }

    public void setSellerInTrade(Boolean sellerInTrade) {
        this.sellerInTrade = sellerInTrade;
    }

    public Boolean getIsBuyNow() {
        return isBuyNow;
    }

    public void setIsBuyNow(Boolean isBuyNow) {
        this.isBuyNow = isBuyNow;
    }

    public Boolean getIsPayNow() {
        return isPayNow;
    }

    public void setIsPayNow(Boolean isPayNow) {
        this.isPayNow = isPayNow;
    }

    public Boolean getIsAfterpay() {
        return isAfterpay;
    }

    public void setIsAfterpay(Boolean isAfterpay) {
        this.isAfterpay = isAfterpay;
    }

    public float getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(float buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public Boolean getMustPickUp() {
        return mustPickUp;
    }

    public void setMustPickUp(Boolean mustPickUp) {
        this.mustPickUp = mustPickUp;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean isExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public Boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public Boolean isHasPhotos() {
        return hasPhotos;
    }

    public void setHasPhotos(Boolean hasPhotos) {
        this.hasPhotos = hasPhotos;
    }

    public Boolean isTracked() {
        return tracked;
    }

    public void setTracked(Boolean tracked) {
        this.tracked = tracked;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public Boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(Boolean featured) {
        isFeatured = featured;
    }

    public Boolean isSuperFeatured() {
        return isSuperFeatured;
    }

    public void setSuperFeatured(Boolean superFeatured) {
        isSuperFeatured = superFeatured;
    }

    public Boolean isHasGtinCode() {
        return hasGtinCode;
    }

    public void setHasGtinCode(Boolean hasGtinCode) {
        this.hasGtinCode = hasGtinCode;
    }

    public float getWasPrice() {
        return wasPrice;
    }

    public void setWasPrice(float wasPrice) {
        this.wasPrice = wasPrice;
    }

    public String getBusinessLine() {
        return businessLine;
    }

    public void setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyRegion() {
        return propertyRegion;
    }

    public void setPropertyRegion(String propertyRegion) {
        this.propertyRegion = propertyRegion;
    }

    public String getPropertyDistrict() {
        return propertyDistrict;
    }

    public void setPropertyDistrict(String propertyDistrict) {
        this.propertyDistrict = propertyDistrict;
    }

    public String getPropertySuburb() {
        return propertySuburb;
    }

    public void setPropertySuburb(String propertySuburb) {
        this.propertySuburb = propertySuburb;
    }

    public String getPropertyPriceType() {
        return propertyPriceType;
    }

    public void setPropertyPriceType(String propertyPriceType) {
        this.propertyPriceType = propertyPriceType;
    }

    public Boolean isPropertyMapShown() {
        return propertyMapShown;
    }

    public void setPropertyMapShown(Boolean propertyMapShown) {
        this.propertyMapShown = propertyMapShown;
    }

    public Boolean isPropertyMapHasSchoolsView() {
        return propertyMapHasSchoolsView;
    }

    public void setPropertyMapHasSchoolsView(Boolean propertyMapHasSchoolsView) {
        this.propertyMapHasSchoolsView = propertyMapHasSchoolsView;
    }

    public Boolean isPropertyMapHasBoundaryView() {
        return propertyMapHasBoundaryView;
    }

    public void setPropertyMapHasBoundaryView(Boolean propertyMapHasBoundaryView) {
        this.propertyMapHasBoundaryView = propertyMapHasBoundaryView;
    }

    public Boolean isPropertyMapHasStreetView() {
        return propertyMapHasStreetView;
    }

    public void setPropertyMapHasStreetView(Boolean propertyMapHasStreetView) {
        this.propertyMapHasStreetView = propertyMapHasStreetView;
    }

    public Boolean isJobsAgent() {
        return jobsAgent;
    }

    public void setJobsAgent(Boolean jobsAgent) {
        this.jobsAgent = jobsAgent;
    }

    public Boolean isShowLuckyOrange() {
        return showLuckyOrange;
    }

    public void setShowLuckyOrange(Boolean showLuckyOrange) {
        this.showLuckyOrange = showLuckyOrange;
    }

    public Boolean isShowLuckyOrangeInSell() {
        return showLuckyOrangeInSell;
    }

    public void setShowLuckyOrangeInSell(Boolean showLuckyOrangeInSell) {
        this.showLuckyOrangeInSell = showLuckyOrangeInSell;
    }

    public String getAbTestEventId() {
        return abTestEventId;
    }

    public void setAbTestEventId(String abTestEventId) {
        this.abTestEventId = abTestEventId;
    }

    public String toString() {
        return String.format("id:%s, title:%s", this.listingId, this.title);
    }
}