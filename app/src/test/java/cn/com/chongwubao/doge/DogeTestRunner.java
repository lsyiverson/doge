package cn.com.chongwubao.doge;


import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.internal.SdkConfig;
import org.robolectric.manifest.AndroidManifest;

import java.io.File;
import java.util.Properties;

public class DogeTestRunner extends RobolectricGradleTestRunner {
    public DogeTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

//    @Override
//    protected AndroidManifest getAppManifest(Config config) {
//        String path = "src/main/AndroidManifest.xml";
//
//        // android studio has a different execution root for tests than pure gradle
//        // so we avoid here manual effort to get them running inside android studio
//        if (!new File(path).exists()) {
//            path = "app/" + path;
//        }
//
//        config = overwriteConfig(config, "manifest", path);
//        return super.getAppManifest(config);
//    }


    protected Config.Implementation overwriteConfig(
            Config config, String key, String value) {
        Properties properties = new Properties();
        properties.setProperty(key, value);
        return new Config.Implementation(config,
                Config.Implementation.fromProperties(properties));
    }

//    @Override
//    protected SdkConfig pickSdkVersion(
//            AndroidManifest appManifest, Config config) {
//        // current Robolectric supports not the latest android SDK version
//        // so we must downgrade to simulate the latest supported version.
//        config = overwriteConfig(config, "emulateSdk", "21");
//        return super.pickSdkVersion(appManifest, config);
//    }


}
