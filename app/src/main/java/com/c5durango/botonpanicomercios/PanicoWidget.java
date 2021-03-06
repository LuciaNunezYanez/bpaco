package com.c5durango.botonpanicomercios;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.c5durango.botonpanicomercios.Servicios.ServicioWidget;

import java.lang.ref.WeakReference;

/**
 * Implementation of App Widget functionality.
 */
public class PanicoWidget extends AppWidgetProvider {

    static WeakReference<Context> contextoGlobal;
    static String TAG = "ServicioWidget";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        contextoGlobal = new WeakReference<>(context);
        Intent intentN = new Intent(context, ServicioWidget.class);
        PendingIntent pendingIntent;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            pendingIntent = PendingIntent.getForegroundService(context, 0, intentN, 0);
        else
            pendingIntent = PendingIntent.getService(context, 0, intentN, 0);

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.panico_widget);
        views.setOnClickPendingIntent(R.id.btnAlertarWidget, pendingIntent);
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
        updateAppWidget(context, appWidgetManager, appWidgetId);
    }

    @Override
    public void onEnabled(Context context) {
    }

    @Override
    public void onDisabled(Context context) {
    }
}

