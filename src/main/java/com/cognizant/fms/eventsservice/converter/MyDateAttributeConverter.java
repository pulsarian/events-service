package com.cognizant.fms.eventsservice.converter;



@Converter(autoApply = true)
public class DateAttributeConverter implements AttributeConverter<Date, String> {

    @Override
    public String convertToDatabaseColumn(Date entityDate) {
        // format entityDate and return String
    }

    @Override
    public Date convertToEntityAttribute(String databaseDate) {
        // parse databaseDate and return Date object
    }
}