
import{getSetting,chooseAddress,openSetting}from"../../utils/asyncWx.js";
import regeneratorRuntime from '../../lib/runtime/runtime';
Page({
  data:{
    address:{},
    cart:[],
    allChecked:false
  },
  
    
  onShow(){
    const address=wx.getStorageSync('address');
    const cart=wx.getStorageSync('cart')||[];
    const allChecked=cart.length?cart.every(v=>v.checked):false;
    this.setData({
      address,
      cart,
      allChecked
    })
  },
  
    async handleChooseAddress(){
    
       try {
       
     
    const res1=await getSetting();
    const scopeAddress=res1.authSetting["scope.address"];  
    if(scopeAddress===false){
       await openSetting();
         
   }

     let address=await chooseAddress();
     address.all=address.provinceName+address.cityName+address.countyName+address.detailInfo

     wx.setStorageSync('address', address);
  

   } catch (error) {
       console.log(error);
   } 
    }
 
})