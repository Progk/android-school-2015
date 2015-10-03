package com.elegion.githubclient.utils.dialogs;


import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.elegion.githubclient.R;

/**
 * Created by Sivulskiy Sergey on 03.10.15.
 */
public class ErrorDialog extends DialogFragment {

    private onClickListenerErrorDialog mOnClickListener;

    public interface onClickListenerErrorDialog {
        public void onClickPositiveButton();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_error)
                .setPositiveButton(R.string.dialog_error_back_btn, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        mOnClickListener.onClickPositiveButton();
                    }
                });
        return builder.create();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mOnClickListener = (onClickListenerErrorDialog) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onClickListenerErrorDialog");
        }
    }
}
