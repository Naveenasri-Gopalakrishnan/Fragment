import com.example.fragment.Employee;
import com.example.fragment.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
        private ArrayList<Employee> emplist;

        public Adapter(ArrayList<Employee> emplist) {
            this.emplist = emplist;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
            return new MyViewHolder(itemView);
        }


        @Override
        public int getItemCount() {
            return emplist.size();
        }


        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Employee currentEmp = emplist.get(position);

        }


        public static class MyViewHolder extends RecyclerView.ViewHolder {
            private TextView name;
            private TextView email;

            public MyViewHolder(View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.tvName);
                email = itemView.findViewById(R.id.tvEmail);
            }
        }
    }

