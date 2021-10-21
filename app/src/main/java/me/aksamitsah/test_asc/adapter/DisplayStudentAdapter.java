package me.aksamitsah.test_asc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.TreeMap;

import me.aksamitsah.test_asc.R;


public class DisplayStudentAdapter  extends RecyclerView.Adapter<DisplayStudentAdapter.ViewHolder> {

    TreeMap<String, String[]> data;

    public DisplayStudentAdapter(TreeMap<String, String[]> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_history,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        /*String[] =data.get(position);
        holder.firstname.setText(data.get(position));
        holder.lastname.setText(data.get(position));
        holder.contact.setText(data.get(position));
        holder.address.setText(data.get(position));*/

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView firstname;
        private final TextView lastname;
        private final TextView contact;
        private final TextView address;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.firstname);
            lastname  = itemView.findViewById(R.id.lastname);
            contact = itemView.findViewById(R.id.contact);
            address  = itemView.findViewById(R.id.address);

        }
    }
}
