package yayasan.idn.doaddandzikir.helper

import yayasan.idn.doaddandzikir.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}