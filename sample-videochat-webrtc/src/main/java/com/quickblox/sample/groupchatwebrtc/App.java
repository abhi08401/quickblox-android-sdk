package com.quickblox.sample.groupchatwebrtc;

import com.quickblox.sample.core.CoreApp;
import com.quickblox.sample.groupchatwebrtc.definitions.Consts;
import com.quickblox.sample.groupchatwebrtc.util.QBResRequestExecutor;

public class App extends CoreApp {
    private static App instance;
    private QBResRequestExecutor qbResRequestExecutor;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication();
    }

    private void initApplication(){
        instance = new App();
        super.initCredentials(Consts.APP_ID, Consts.AUTH_KEY, Consts.AUTH_SECRET, Consts.ACCOUNT_KEY);

    }

    public synchronized QBResRequestExecutor getQbResRequestExecutor() {
        return qbResRequestExecutor == null
                ? qbResRequestExecutor = new QBResRequestExecutor()
                : qbResRequestExecutor;
    }
}
