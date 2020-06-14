# weather
## How to run this project?
1. Download this project
2. Build this project. Run below command inside project's root folder<br>mvn clean istall</br>
3. Once build completed successfully inside the target folder you can find : weather-0.0.1-SNAPSHOT-jar-with-dependencies.jar
4. Now you can run this jar file <br>
    java -jar weather-0.0.1-SNAPSHOT-jar-with-dependencies.jar 39.7456,-97.0892<br>
    
## Any third party jar used?
  Yes I have used the Jakson jar for JSON to Java Objects.

## How you implemnted jar Rest Call?
   I used only URL and URLConnection to make rest calls.

## What is RestClient?
  Rest Client is used to pull data from weather url.
  
## What will be the output this project?
  It prints Tabluar formatted weather details on console.
  
## Have you implemented Unit Test Cases?
	Yes Unit Test Cases were implemented for the following classes.
		Rest client : This Client is used to send http client and get data as String.
		ForecastHelper : ForecastHelper is used to do logic.
