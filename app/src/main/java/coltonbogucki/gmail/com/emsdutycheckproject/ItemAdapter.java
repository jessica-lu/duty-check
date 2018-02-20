package coltonbogucki.gmail.com.emsdutycheckproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by coltonbogucki on 2/16/18.
 */


public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;

    public ItemAdapter(Context c, String[] i)
    {
        items = i;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.activity_duty, null );
        TextView checkListTextView = (TextView) v.findViewById(R.id.checkListTextView);
        Button itemsBtn = (Button) v.findViewById(R.id.itemsBtn);
        String name = items[i];
        checkListTextView.setText(name);

        return v;
    }
}
