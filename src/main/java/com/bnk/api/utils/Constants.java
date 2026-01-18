package com.bnk.api.utils;

public class Constants {
	
	public static final String IMPS_JSON_SCHEMA = "IMPS_SchemaValidation.json";
    public static final String MB_JSON_SCHEMA = "MBJsonSchema.json";
    public static final String HTTP_FAILED_STATUS = "0";
    public static final String HTTP_SUCCESS_STATUS = "1";
    public static final String STATUS_CODE = "StatusCode";
    public static final String STATUS_DESC = "StatusDescription";
    public static final String TRANSACTION_DESC = "transaction_txnErrorDesc";
    public static final String TRANSACTION_CODE = "transaction_description";
    public static final String DESCRIPTION = "description";
    public static final String STATUSCODE = "status_code";
    public static final String MB_DESCRIPTION = "STATUS";
    public static final String IS_ANY_DELAY = "is_any_delay";
    public static final String IS_DEFAULTER = "is_defaulter";
    public static final String DMS_SUCCESS = "1";
    public static final String DMS_FAILED = "0";
    public static final String TRANSACTION_SUCCESS = "0";
    public static final String TRANSACTION_FAILED = "1";
    public static final String ACKNOWLEDGEMENT_ID = "acknowledgement_id";


    public static final class StatusCode {

        public static final String SUCCESS = "101";
        public static final String INVALID_INPUTS = "102";
        public static final String NO_RECORDS_FOUND = "103";
        public static final String MAX_RETRIES_EXCEEDED = "104";
        public static final String MULTIPLE_RECORDS_EXIST = "105";
        public static final String SERVICE_UNAVAILABLE = "106";
        public static final String BAD_REQUEST = "107";
        public static final String TOKEN_GENERATION_ERROR = "108";
        public static final String INVALID_TOKEN = "109";
        public static final String TOKEN_EXPIRED = "110";
        public static final String TOKEN_BEARER_NOT_FOUND = "111";
        public static final String AUTHENTICATION_FAILED = "112";
        public static final String PASSWORD_EXPIRED = "113";
        public static final String ACCOUNT_LOCKED = "114";
        public static final String INVALID_USERNAME_AND_PASSWORD = "115";
        public static final String FAILED = "116";
        public static final String SERVER_CONNECTION_TIMEOUT = "117";
        public static final String VALUE_TOO_LARGE = "118";
        public static final String INTERNAL_SERVER_ERROR = "119";

    }

    public static final class StatusDescription {

        public static final String SUCCESS = "Success";
        public static final String INVALID_INPUTS = "Mandatory parameters missing or Invalid Inputs";
        public static final String NO_RECORDS_FOUND = "No records found";
        public static final String MAX_RETRIES_EXCEEDED = "Max retries exceeded";
        public static final String MULTIPLE_RECORDS_EXIST = "Multiple Records Exist";
        public static final String SERVICE_UNAVAILABLE = "Service Unavailable";
        public static final String BAD_REQUEST = "Bad Request";
        public static final String TOKEN_GENERATION_ERROR = "Token generation error";
        public static final String INVALID_TOKEN = "Invalid Token";
        public static final String TOKEN_EXPIRED = "Token Expired";
        public static final String TOKEN_BEARER_NOT_FOUND = "Token Bearer not found ";
        public static final String AUTHENTICATION_FAILED = "AD authentication failed";
        public static final String PASSWORD_EXPIRED = "AD password expired";
        public static final String ACCOUNT_LOCKED = "AD account locked";
        public static final String INVALID_USERNAME_AND_PASSWORD = "Invalid username & password";
        public static final String FAILED = "Failed ";
        public static final String SERVER_CONNECTION_TIMEOUT = "Server connection timeout";
        public static final String VALUE_TOO_LARGE = "Value was either too large or too small for an Int32.";
        public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
    }


}
