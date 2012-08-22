package com.lukaszkaniowski.webView;

import android.app.Activity;
import android.content.Intent;
import android.net.MailTo;
import android.net.Uri;

/**
 * @author lukasz.kaniowski@gmail.com
 * @since 22.08.2012
 */
public class WebViewUtils {

    public static boolean startUrlIntent(String url, Activity activity) {
        if (url.startsWith("mailto:")) {
            startEmailIntent(url, activity);
        } else if (url.startsWith("market:")) {
            activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        } else {
            return false;
        }
        return true;
    }

    public static void startEmailIntent(String url, Activity activity) {
        MailTo mt = MailTo.parse(url);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{mt.getTo()});
        intent.putExtra(Intent.EXTRA_TEXT, mt.getBody());
        intent.putExtra(Intent.EXTRA_SUBJECT, mt.getSubject());
        intent.putExtra(Intent.EXTRA_CC, mt.getCc());
        intent.setType("message/rfc822");
        activity.startActivity(intent);
    }

}
