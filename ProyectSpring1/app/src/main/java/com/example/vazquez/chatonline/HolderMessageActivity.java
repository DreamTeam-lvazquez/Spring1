package com.example.vazquez.chatonline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vazquez.chatonline.R;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by vazquez on 28/02/2018.
 */

public class HolderMessageActivity extends RecyclerView.ViewHolder {

    private TextView name;
    private  TextView message;
    private TextView time;
    private CircleImageView photoMessagePerfil;
    private ImageView photoMessage;

    public HolderMessageActivity(View itemView) {
        super(itemView);
        name =(TextView) itemView.findViewById(R.id.name_message);
        message= (TextView) itemView.findViewById(R.id.message_message);
        time = (TextView) itemView.findViewById(R.id.time_message);
        photoMessagePerfil= (CircleImageView) itemView.findViewById(R.id.photo_perfil_messaje);
        photoMessage = (ImageView) itemView.findViewById(R.id.messagePhoto);
 }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getMessage() {
        return message;
    }

    public void setMessage(TextView message) {
        this.message = message;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public CircleImageView getPhotoMessagePerfil() {
        return photoMessagePerfil;
    }

    public void setPhotoMessagePerfil(CircleImageView photoMessage) {
        this.photoMessagePerfil = photoMessage;
    }

    public ImageView getPhotoMessage() {
        return photoMessage;
    }

    public void setPhotoMessage(ImageView photoMessage) {
        this.photoMessage = photoMessage;
    }
}
