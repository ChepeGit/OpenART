package com.hkm.openart.network
import com.google.firebase.firestore.FirebaseFirestore

const val USERS_COLLECTION_NAME = "auth"
class FirestoreService(val firebaseFirestore: FirebaseFirestore) {

    fun setDocument(data: Any, collectionName: String, id: String, callback: Callback<Void>){
        firebaseFirestore.collection(collectionName).document(id).set(data)
            .addOnSuccessListener { callback.onSuccess(null) }
            .addOnFailureListener{ exception -> callback.onFail(exception)}
    }

    //im working in this, just wait
}