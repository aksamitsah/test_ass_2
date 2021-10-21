package me.aksamitsah.test_asc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.aksamitsah.test_asc.R;
import me.aksamitsah.test_asc.Student;


public class DisplayStudentAdapter extends RecyclerView.Adapter<DisplayStudentAdapter.ViewHolder> {

    ArrayList<Student> data;

    public DisplayStudentAdapter(ArrayList<Student> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.firstname.setText(data.get(position).getFirstname());
        holder.lastname.setText(data.get(position).getLastname());
        holder.contact.setText(data.get(position).getContact());
        holder.address.setText(data.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView firstname;
        TextView lastname;
        TextView contact;
        TextView address;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.firstname1);
            lastname = itemView.findViewById(R.id.lastname);
            contact = itemView.findViewById(R.id.contact);
            address = itemView.findViewById(R.id.address);

        }
    }
}
