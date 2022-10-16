// pages/indexthing/things.js
//const { request } = require('../../request/index.js')
import{request}from"../../request/index.js";
import regeneratorRuntime from '../../lib/runtime/runtime';
Page({

    /**
     * 页面的初始数据
     */
    data: {
       
        goodsobj:{}
       
         
    },

    handleCartAdd() {
      let cart = wx.getStorageSync("cart") || [];
      console.log(this.data.goodsobj)
      let index = cart.findIndex(v => v.id === this.data.goodsobj.id)

      if (index === -1) {
        
          this.data.goodsobj.goods_number = 1
          this.data.goodsobj.checked =true
          cart.push(this.data.goodsobj)
      } else {
          cart[index].goods_number++
      }
      wx.setStorageSync('cart', cart);
      wx.showToast({
          title: '已经加入购物车',
          icon: 'success',
          // true 防止用户 手抖 疯狂点击按钮 
          mask: true
      })
  },

    
    
    onLoad:function(options){
        const{id}=options;
        this.getgoodsdetail(id);
      
     
    },
    async getgoodsdetail(id){
        const goodsobj=await request({url:"http://175.178.183.81:8989/orderwater/goods/find?id=",data:{id}});
        this.setData(
          {goodsobj:goodsobj.data}
        )
    },
    
})