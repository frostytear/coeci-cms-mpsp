/*
 * Copyright (C) 2012 TopCoder Inc., All Rights Reserved.
 */
package gov.medicaid.screening.services;

import gov.medicaid.entities.License;
import gov.medicaid.entities.MedicalPracticeLicenseSearchCriteria;
import gov.medicaid.entities.SearchResult;

/**
 * This defines the available services for searching for Medical Practice Licenses.
 *
 * @author sampath01, j3_guile
 * @version 1.0
 */
public interface MedicalPracticeLicenseService {

    /**
     * Searches for providers with Medical Practice license using the name filter.
     *
     * @param criteria the search criteria
     * @return the matched results
     * @throws ParsingException if any parsing errors are encountered
     * @throws ServiceException for any other exceptions encountered
     */
    public SearchResult<License> searchByName(MedicalPracticeLicenseSearchCriteria criteria) throws ParsingException,
        ServiceException;

    /**
     * Searches for providers with Medical Practice license using the license number filter.
     *
     * @param criteria the search criteria
     * @return the matched results
     * @throws ParsingException if any parsing errors are encountered
     * @throws ServiceException for any other exceptions encountered
     */
    public SearchResult<License> searchBySpecialty(MedicalPracticeLicenseSearchCriteria criteria)
        throws ParsingException, ServiceException;
}
