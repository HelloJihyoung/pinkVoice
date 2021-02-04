package com.example.myapplication3.ui.qr;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QRViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QRViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is qr mode fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}