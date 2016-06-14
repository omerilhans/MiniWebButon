package android.projects.miniwebwithfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebFragment extends Fragment
{
    View fragmentRoot = null;
    WebView web;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //fragmentRoot, Tasarladigim fragment_layout.xml Dosyasının
        // Giydirileceği Custom View
        fragmentRoot = inflater.inflate(R.layout.fragment_layout, container, false);

        web = (WebView) fragmentRoot.findViewById(R.id.wv);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setPluginState(WebSettings.PluginState.ON);
        web.setWebViewClient(new WebViewClient());

        // Fragment'in Icinde, Activity'e Erişmek
        MainActivity root = (MainActivity) getActivity();
        web.loadUrl(root.gidilecekAdres);

        return  fragmentRoot;
    }


}
