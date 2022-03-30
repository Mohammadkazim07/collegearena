package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GatecsitsylActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatecsitsyl);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("csgatesyl.pdf").load();
    }
}