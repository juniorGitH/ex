package com.example.weather;

public class WeatherItem {
    private String title;
    private String link;
    private String description;
    private String pubDate;
    private String guid;
    private String geoPoint;
    private String maxTemperature;
    private String minTemperature;
    private String windDirection;
    private String windSpeed;
    private String Visibility;
    private String Pressure;
    private String humidity;
    private String sunrise;
    private String sunset;
    private String uvRisk;
    private String pollution;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(String geoPoint) {
        this.geoPoint = geoPoint;
    }





    /////////


    @Override
    public String toString() {
        return "WeatherItem{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", guid='" + guid + '\'' +
                ", geoPoint='" + geoPoint + '\'' +
                ", maxTemperature='" + maxTemperature + '\'' +
                ", minTemperature='" + minTemperature + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", Visibility='" + Visibility + '\'' +
                ", Pressure='" + Pressure + '\'' +
                ", humidity='" + humidity + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", uvRisk='" + uvRisk + '\'' +
                ", pollution='" + pollution + '\'' +
                '}';
    }

    public void setDescriptio (String description) {


            String[] parts = description.split(", ");


            for (String part : parts) {
                // Diviser chaque partie en clé et valeur basées sur ": "
                String[] keyValue = part.split(": ");
                String key = keyValue[0].trim(); // Retirer les espaces autour de la clé
                String value = keyValue[1].trim(); // Retirer les espaces autour de la valeur

                // Utiliser un switch pour attribuer les valeurs aux variables correspondantes
                switch (key) {
                    case "Maximum Temperature":

                         this.maxTemperature = value;
                        break;
                    case "Minimum Temperature":

                         this.minTemperature = value;
                        break;
                    case "Wind Direction":

                        this.windDirection = value;
                        break;
                    case "Wind Speed":

                        this.windSpeed = value;
                        break;
                    case "Visibility":

                        this.Visibility = value;
                        break;
                    case "Pressure":
                        this.Pressure = value;
                        break;
                    case "Humidity":
                        this.humidity = value;
                        break;
                    case "UV Risk":
                        this.uvRisk = value;
                        break;
                    case "Pollution":
                        this.pollution = value;
                        break;
                    case "Sunrise":
                        this.sunrise = value;
                        break;
                    case "Sunset":
                        this.sunset = value;
                        break;

                    default:

                        break;
                }
            }
        }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getVisibility() {
        return Visibility;
    }

    public void setVisibility(String visibility) {
        Visibility = visibility;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String pressure) {
        Pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getUvRisk() {
        return uvRisk;
    }

    public void setUvRisk(String uvRisk) {
        this.uvRisk = uvRisk;
    }

    public String getPollution() {
        return pollution;
    }

    public void setPollution(String pollution) {
        this.pollution = pollution;
    }


    ////////
}

