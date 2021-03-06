package com.faceswiping.app.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.faceswiping.app.activity.AddNewFriendActivity;
import com.faceswiping.app.activity.FaceIdentificationActivity;
import com.faceswiping.app.activity.LoginActivity;
import com.faceswiping.app.activity.MainActivity;
import com.faceswiping.app.activity.MarkNewFriendsActivity;
import com.faceswiping.app.activity.NewFriendsActivity;
import com.faceswiping.app.activity.SecretSettingActivity;
import com.faceswiping.app.activity.SendFriendRequestActivity;
import com.faceswiping.app.activity.SettingActivity;

/**
 * 界面帮助类
 *
 * @author FireAnt（http://my.oschina.net/LittleDY）
 * @version 创建时间：2014年10月10日 下午3:33:36
 */
public class UIHelper {

    public static void showMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void showLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }


    public static void sendAppCrashReport(final Context context) {

        DialogHelp.getConfirmDialog(context, "程序发生异常", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // 退出
                System.exit(-1);
            }
        }).show();
    }


    public static void showFaceIdentificationActivity(Context context) {

        Intent intent = new Intent(context, FaceIdentificationActivity.class);
        context.startActivity(intent);

    }

    public static void showSecretSettingActivity(Context context) {

        Intent intent = new Intent(context, SecretSettingActivity.class);
        context.startActivity(intent);

    }

    public static void showNewFriendsActivity(Context context) {

        Intent intent = new Intent(context, NewFriendsActivity.class);
        context.startActivity(intent);

    }

    public static void shoAddNewFriendsActivity(Context context) {

        Intent intent = new Intent(context, AddNewFriendActivity.class);
        context.startActivity(intent);

    }

    public static void showSettingActivity(Context context) {

        Intent intent = new Intent(context, SettingActivity.class);
        context.startActivity(intent);

    }

    public static void showMarkNewFriendsActivity(String key, String url, Context context) {

        Intent intent = new Intent(context, MarkNewFriendsActivity.class);
        intent.putExtra("key", key);
        intent.putExtra("url", url);
        context.startActivity(intent);

    }

    public static void showSendFriendRequestActivity(String url, String key, int id, Context context) {

        Intent intent = new Intent(context, SendFriendRequestActivity.class);
        intent.putExtra("url", url);
        intent.putExtra("key", key);
        intent.putExtra("id", id);
        context.startActivity(intent);

    }


}
