package com.server.trabalhoboer.dto;

public class GoogleAuthDTO {

    private String clientId;
    private String client_Id;
    private String credential;
    private String select_by;
    private String g_csrf_token;
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getClient_Id() {
        return client_Id;
    }
    public void setClient_Id(String client_Id) {
        this.client_Id = client_Id;
    }
    public String getCredential() {
        return credential;
    }
    public void setCredential(String credential) {
        this.credential = credential;
    }
    public String getSelect_by() {
        return select_by;
    }
    public void setSelect_by(String select_by) {
        this.select_by = select_by;
    }
    public String getG_csrf_token() {
        return g_csrf_token;
    }
    public void setG_csrf_token(String g_csrf_token) {
        this.g_csrf_token = g_csrf_token;
    }

    

}
