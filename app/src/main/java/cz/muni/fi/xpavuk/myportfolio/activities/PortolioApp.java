package cz.muni.fi.xpavuk.myportfolio.activities;

import android.app.Application;

import butterknife.ButterKnife;
import cz.muni.fi.xpavuk.myportfolio.R;
import io.realm.Realm;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class PortolioApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ButterKnife.setDebug(true);
        Realm.init(this);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
