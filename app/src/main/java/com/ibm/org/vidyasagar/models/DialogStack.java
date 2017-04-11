package com.ibm.org.vidyasagar.models;

/**
 * Created by Rafael Moris on 11/04/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DialogStack {

    @SerializedName("dialog_node")
    @Expose
    private String dialogNode;

    public String getDialogNode() {
        return dialogNode;
    }

    public void setDialogNode(String dialogNode) {
        this.dialogNode = dialogNode;
    }
}