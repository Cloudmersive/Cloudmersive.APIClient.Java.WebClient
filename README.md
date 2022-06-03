# cloudmersive-java-api-client-gac

currencyapi

- API version: v1

- Build date: 2022-06-02T23:39:11.036773300-07:00[America/Los_Angeles]

The currency APIs help you retrieve exchange rates and convert prices between currencies easily.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cloudmersive.gac</groupId>
  <artifactId>cloudmersive-java-api-client-gac</artifactId>
  <version>4.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'cloudmersive-java-api-client-gac' jar has been published to maven central.
    mavenLocal()       // Needed if the 'cloudmersive-java-api-client-gac' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.cloudmersive.gac:cloudmersive-java-api-client-gac:4.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/cloudmersive-java-api-client-gac-4.0.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudmersive.client.gac.invoker.*;
import com.cloudmersive.client.gac.invoker.auth.*;
import com.cloudmersive.client.gac.model.*;
import com.cloudmersive.client.gac.CurrencyExchangeApi;

public class CurrencyExchangeApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        String source = "source_example"; // String | Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        String destination = "destination_example"; // String | Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        Double sourcePrice = 3.4D; // Double | Input price, such as 19.99 in source currency
        try {
            ConvertedCurrencyResult result = apiInstance.currencyExchangeConvertCurrency(source, destination, sourcePrice);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeConvertCurrency");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CurrencyExchangeApi* | [**currencyExchangeConvertCurrency**](docs/CurrencyExchangeApi.md#currencyExchangeConvertCurrency) | **POST** /currency/exchange-rates/convert/{source}/to/{destination} | Converts a price from the source currency into the destination currency
*CurrencyExchangeApi* | [**currencyExchangeGetAvailableCurrencies**](docs/CurrencyExchangeApi.md#currencyExchangeGetAvailableCurrencies) | **POST** /currency/exchange-rates/list-available | Get a list of available currencies and corresponding countries
*CurrencyExchangeApi* | [**currencyExchangeGetExchangeRate**](docs/CurrencyExchangeApi.md#currencyExchangeGetExchangeRate) | **POST** /currency/exchange-rates/get/{source}/to/{destination} | Gets the exchange rate from the source currency into the destination currency


## Documentation for Models

 - [AvailableCurrency](docs/AvailableCurrency.md)
 - [AvailableCurrencyResponse](docs/AvailableCurrencyResponse.md)
 - [ConvertedCurrencyResult](docs/ConvertedCurrencyResult.md)
 - [ExchangeRateResult](docs/ExchangeRateResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey


- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



