package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Daud Ridho Ilahi", "Laki-Laki", "daudridho3@gmail.com",
        "081333138479", "Jombang"))
        listTeman.add(MyFriend("Dhiya Ulhag", "Laki-Laki", "ulhag@gmail.com",
        "087766621855", "Malang"))
        listTeman.add(MyFriend("Oky Mikhael", "Laki-Laki", "okymikael@gmail.com", "085604056893", "Malang"))
        listTeman.add(MyFriend("Nova Eka Permadani", "Laki-Laki", "novaeka@gmail.com", "088235718459", "Malang"))
        listTeman.add(MyFriend("Indra Oki Sandy", "Laki-Laki", "indraoki@gmail.com", "089520603456", "Malang"))
        listTeman.add(MyFriend("Stephani ", "Perempuan","stephani@gmail.com", "0895800360190", "Malang"))
        listTeman.add(MyFriend("Mario Aji","Laki-Laki", "mario@gmail.com", "081235101468", "Malang"))
        listTeman.add(MyFriend("Komang Damai","Laki-Laki", "komang@gmail.com", "082259250387", "Malang"))

    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!,listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}