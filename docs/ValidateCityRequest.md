

# ValidateCityRequest

Request to Validate a City and State or Province in a country

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**city** | **String** | Required: City of the address to validate, such as &#39;San Francisco&#39; or &#39;London&#39; |  [optional] |
|**stateOrProvince** | **String** | Required: State or province of the address to validate, such as &#39;California&#39; or &#39;CA&#39; |  [optional] |
|**countryFullName** | **String** | Optional (recommended); Name of the country, such as &#39;United States&#39;.  If left blank, and CountryCode is also left blank, will default to United States.  Global countries are supported. |  [optional] |
|**countryCode** | **String** | Optional; two-letter country code (Two-letter ISO 3166-1 country code) of the country.  If left blank, and CountryFullName is also left blank, will default to United States.  Global countries are supported. |  [optional] |



