/*
 * Copyright (C) 2012 TopCoder Inc., All Rights Reserved.
 */
package gov.medicaid.entities;

import gov.medicaid.entities.LicenseType;

/**
 * This represents the search criteria for Board of Behavioral Health and Therapy License.
 *
 * @author sampath01, j3_guile
 * @version 1.0
 */
public class BBHTLicenseSearchCriteria extends SearchCriteria {

    /**
     * License number type. http://apps.topcoder.com/forums/?module=Thread&threadID=758163&start=0
     */
    private LicenseType licenseType;

    /**
     * Default empty constructor.
     */
    public BBHTLicenseSearchCriteria() {
    }

    /**
     * Gets the value of the field <code>licenseType</code>.
     *
     * @return the licenseType
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the field <code>licenseType</code>.
     *
     * @param licenseType the licenseType to set
     */
    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }
}