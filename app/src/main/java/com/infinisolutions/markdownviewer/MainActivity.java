package com.infinisolutions.markdownviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.tiagohm.markdownview.MarkdownView;
import br.tiagohm.markdownview.css.styles.Github;

public class MainActivity extends AppCompatActivity {

    MarkdownView mMarkdownView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMarkdownView = (MarkdownView)findViewById(R.id.markdown_view);
        mMarkdownView.addStyleSheet(new Github());
        mMarkdownView.loadMarkdown("**MarkdownView** is working");

    }
}