(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-3bef084f","chunk-259eace8","chunk-fc8c7afa","chunk-68b81eec","chunk-2d0e1b62"],{"11cb":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{width:900,keyboard:!1,closable:!1,centered:!0,maskClosable:!1,mask:!1,okText:"确认",cancelText:"取消"},on:{ok:e.ok,cancel:e.cancel},model:{value:e.show,callback:function(t){e.show=t},expression:"show"}},[a("a-tabs",[a("a-tab-pane",{key:"1",attrs:{tab:"方向性图标"}},[a("ul",e._l(e.icons.directionIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)]),a("a-tab-pane",{key:"2",attrs:{tab:"指示性图标"}},[a("ul",e._l(e.icons.suggestionIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)]),a("a-tab-pane",{key:"3",attrs:{tab:"编辑类图标"}},[a("ul",e._l(e.icons.editIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)]),a("a-tab-pane",{key:"4",attrs:{tab:"数据类图标"}},[a("ul",e._l(e.icons.dataIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)]),a("a-tab-pane",{key:"5",attrs:{tab:"网站通用图标"}},[a("ul",e._l(e.icons.webIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)]),a("a-tab-pane",{key:"6",attrs:{tab:"品牌和标识"}},[a("ul",e._l(e.icons.logoIcons,(function(t){return a("li",{key:t},[a("a-icon",{class:{active:e.activeIndex===t},attrs:{type:t,title:t},on:{click:function(a){return e.chooseIcon(t)}}})],1)})),0)])],1)],1)},l=[],s=["step-backward","step-forward","fast-backward","fast-forward","shrink","arrows-alt","down","up","left","right","caret-up","caret-down","caret-left","caret-right","up-circle","down-circle","left-circle","right-circle","up-circle-o","down-circle-o","right-circle-o","left-circle-o","double-right","double-left","vertical-left","vertical-right","forward","backward","rollback","enter","retweet","swap","swap-left","swap-right","arrow-up","arrow-down","arrow-left","arrow-right","play-circle","play-circle-o","up-square","down-square","left-square","right-square","up-square-o","down-square-o","left-square-o","right-square-o","login","logout","menu-fold","menu-unfold","border-bottom","border-horizontal","border-inner","border-left","border-right","border-top","border-verticle","pic-center","pic-left","pic-right","radius-bottomleft","radius-bottomright","radius-upleft","radius-upright","fullscreen","fullscreen-exit"],i=["question","question-circle","plus","plus-circle","pause","pause-circle","minus","minus-circle","plus-square","minus-square","info","info-circle","exclamation","exclamation-circle","close","close-circle","close-square","check","check-circle","check-square","clock-circle","warning","issues-close","stop"],r=["edit","form","copy","scissor","delete","snippets","diff","highlight","align-center","align-left","align-right","bg-colors","bold","italic","underline","strikethrough","redo","undo","zoom-in","zoom-out","font-colors","font-size","line-height","colum-height","dash","small-dash","sort-ascending","sort-descending","drag","ordered-list","radius-setting"],n=["area-chart","pie-chart","bar-chart","dot-chart","line-chart","radar-chart","heat-map","fall","rise","stock","box-plot","fund","sliders"],c=["lock","unlock","bars","book","calendar","cloud","cloud-download","code","copy","credit-card","delete","desktop","download","ellipsis","file","file-text","file-unknown","file-pdf","file-word","file-excel","file-jpg","file-ppt","file-markdown","file-add","folder","folder-open","folder-add","hdd","frown","meh","smile","inbox","laptop","appstore","link","mail","mobile","notification","paper-clip","picture","poweroff","reload","search","setting","share-alt","shopping-cart","tablet","tag","tags","to-top","upload","user","video-camera","home","loading","loading-3-quarters","cloud-upload","star","heart","environment","eye","camera","save","team","solution","phone","filter","exception","export","customer-service","qrcode","scan","like","dislike","message","pay-circle","calculator","pushpin","bulb","select","switcher","rocket","bell","disconnect","database","compass","barcode","hourglass","key","flag","layout","printer","sound","usb","skin","tool","sync","wifi","car","schedule","user-add","user-delete","usergroup-add","usergroup-delete","man","woman","shop","gift","idcard","medicine-box","red-envelope","coffee","copyright","trademark","safety","wallet","bank","trophy","contacts","global","shake","api","fork","dashboard","table","profile","alert","audit","branches","build","border","crown","experiment","fire","money-collect","property-safety","read","reconciliation","rest","security-scan","insurance","interation","safety-certificate","project","thunderbolt","block","cluster","deployment-unit","dollar","euro","pound","file-done","file-exclamation","file-protect","file-search","file-sync","gateway","gold","robot","shopping"],d=["android","apple","windows","ie","chrome","github","aliwangwang","dingding","weibo-square","weibo-circle","taobao-circle","html5","weibo","twitter","wechat","youtube","alipay-circle","taobao","skype","qq","medium-workmark","gitlab","medium","linkedin","google-plus","dropbox","facebook","codepen","amazon","google","codepen-circle","alipay","ant-design","aliyun","zhihu","slack","slack-square","behance","behance-square","dribbble","dribbble-square","instagram","yuque","alibaba","yahoo"],u={name:"Icons",props:{iconChooseVisible:{default:!1}},data:function(){return{icons:{directionIcons:s,suggestionIcons:i,editIcons:r,dataIcons:n,webIcons:c,logoIcons:d},choosedIcon:"",activeIndex:""}},computed:{show:{get:function(){return this.iconChooseVisible},set:function(){}}},methods:{reset:function(){this.activeIndex=""},chooseIcon:function(e){this.activeIndex=e,this.choosedIcon=e,this.$message.success("选中 ".concat(e))},ok:function(){""!==this.choosedIcon?(this.reset(),this.$emit("choose",this.choosedIcon)):this.$message.warning("尚未选择任何图标")},cancel:function(){this.reset(),this.$emit("close")}}},m=u,p=(a("3ab1"),a("2877")),h=Object(p["a"])(m,o,l,!1,null,"ea6fbdbc",null);t["default"]=h.exports},"315e":function(e,t,a){"use strict";var o=a("d90d"),l=a.n(o);l.a},"3ab1":function(e,t,a){"use strict";var o=a("3bf4"),l=a.n(o);l.a},"3bf4":function(e,t,a){},"56cd1":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-drawer",{attrs:{title:"数据权限规则",width:e.drawerWidth,visible:e.visible},on:{close:e.onClose}},[a("div",{style:{padding:"10px",border:"1px solid #e9e9e9",background:"#fff"}},[a("div",{staticClass:"table-page-search-wrapper"},[a("a-form",{nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.searchQuery(t)}}},[a("a-row",{attrs:{gutter:12}},[a("a-col",{attrs:{md:8,sm:8}},[a("a-form-item",{attrs:{label:"规则名称",labelCol:{span:8},wrapperCol:{span:14,offset:1}}},[a("a-input",{attrs:{placeholder:"请输入规则名称"},model:{value:e.queryParam.ruleName,callback:function(t){e.$set(e.queryParam,"ruleName",t)},expression:"queryParam.ruleName"}})],1)],1),a("a-col",{attrs:{md:8,sm:8}},[a("a-form-item",{attrs:{label:"规则值",labelCol:{span:8},wrapperCol:{span:14,offset:1}}},[a("a-input",{attrs:{placeholder:"请输入规则值"},model:{value:e.queryParam.ruleValue,callback:function(t){e.$set(e.queryParam,"ruleValue",t)},expression:"queryParam.ruleValue"}})],1)],1),a("a-col",{attrs:{md:7,sm:8}},[a("span",{staticClass:"table-page-search-submitButtons",staticStyle:{float:"left",overflow:"hidden"}},[a("a-button",{attrs:{type:"primary",icon:"search"},on:{click:e.searchQuery}},[e._v("查询")]),a("a-button",{staticStyle:{"margin-left":"8px"},attrs:{type:"primary",icon:"reload"},on:{click:e.searchReset}},[e._v("重置")])],1)])],1),a("a-row",[a("a-col",{attrs:{md:24,sm:24}},[a("a-button",{staticStyle:{"margin-bottom":"10px"},attrs:{type:"primary",icon:"plus"},on:{click:e.addPermissionRule}},[e._v("添加")])],1)],1)],1),a("a-table",{ref:"table",attrs:{rowKey:"id",size:"middle",columns:e.columns,dataSource:e.dataSource,loading:e.loading,rowClassName:e.getRowClassname},scopedSlots:e._u([{key:"ruleValueText",fn:function(e,t){return[a("j-ellipsis",{attrs:{value:e,length:15}})]}},{key:"action",fn:function(t,o){return a("span",{},[a("a",{on:{click:function(t){return e.handleEdit(o)}}},[a("a-icon",{attrs:{type:"edit"}}),e._v("编辑\n          ")],1),a("a-divider",{attrs:{type:"vertical"}}),a("a-popconfirm",{attrs:{title:"确定删除吗?"},on:{confirm:function(){return e.handleDelete(o.id)}}},[a("a",[e._v("删除")])])],1)}}])})],1)]),a("permission-data-rule-modal",{ref:"modalForm",on:{ok:e.modalFormOk}})],1)},l=[],s=a("4ec3"),i=a("b65a"),r=a("7c33"),n=[{title:"规则名称",dataIndex:"ruleName",key:"ruleName",width:150},{title:"规则字段",dataIndex:"ruleColumn",key:"ruleColumn",width:150},{title:"规则值",dataIndex:"ruleValue",key:"ruleValue",width:150,scopedSlots:{customRender:"ruleValueText"}},{title:"操作",dataIndex:"action",scopedSlots:{customRender:"action"},align:"center"}],c={name:"PermissionDataRuleList",mixins:[i["a"]],components:{PermissionDataRuleModal:r["default"]},data:function(){return{queryParam:{},drawerWidth:650,columns:n,permId:"",visible:!1,form:this.$form.createForm(this),loading:!1,url:{list:"/sys/permission/getPermRuleListByPermId",delete:"/sys/permission/deletePermissionRule"}}},created:function(){this.resetScreenSize()},methods:{loadData:function(){if(this.permId){var e=this;this.dataSource=[];var t=this.getQueryParams();Object(s["w"])(t).then((function(t){t.success&&(e.dataSource=t.result)}))}},edit:function(e){e.id&&(this.visible=!0,this.permId=e.id),this.queryParam={},this.queryParam.permissionId=e.id,this.visible=!0,this.loadData(),this.resetScreenSize()},addPermissionRule:function(){this.$refs.modalForm.add(this.permId),this.$refs.modalForm.title="新增"},searchQuery:function(){var e=this,t=this.getQueryParams();t.permissionId=this.permId,Object(s["I"])(t).then((function(t){t.success&&(e.dataSource=t.result)}))},searchReset:function(){this.queryParam={},this.queryParam.permissionId=this.permId,this.loadData(1)},onClose:function(){this.visible=!1},resetScreenSize:function(){var e=document.body.clientWidth;this.drawerWidth=e<500?e:650},getRowClassname:function(e){if(1!=e.status)return"data-rule-invalid"}}},d=c,u=(a("315e"),a("2877")),m=Object(u["a"])(d,o,l,!1,null,null,null);t["default"]=m.exports},"7c33":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{title:e.title,width:1e3,visible:e.visible,confirmLoading:e.confirmLoading,cancelText:"关闭"},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form-model",{ref:"form",attrs:{model:e.model,rules:e.validatorRules}},[a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"ruleName",label:"规则名称"}},[a("a-input",{attrs:{placeholder:"请输入规则名称"},model:{value:e.model.ruleName,callback:function(t){e.$set(e.model,"ruleName",t)},expression:"model.ruleName"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.showRuleColumn,expression:"showRuleColumn"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"ruleColumn",label:"规则字段"}},[a("a-input",{attrs:{placeholder:"请输入规则字段"},model:{value:e.model.ruleColumn,callback:function(t){e.$set(e.model,"ruleColumn","string"===typeof t?t.trim():t)},expression:"model.ruleColumn"}})],1),a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"ruleConditions",label:"条件规则"}},[a("j-dict-select-tag",{attrs:{placeholder:"请输入条件规则",dictCode:"rule_conditions"},on:{input:e.handleChangeRuleCondition},model:{value:e.model.ruleConditions,callback:function(t){e.$set(e.model,"ruleConditions",t)},expression:"model.ruleConditions"}})],1),a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"ruleValue",label:"规则值"}},[a("a-input",{attrs:{placeholder:"请输入规则值"},model:{value:e.model.ruleValue,callback:function(t){e.$set(e.model,"ruleValue",t)},expression:"model.ruleValue"}})],1),a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"状态"}},[a("a-radio-group",{attrs:{buttonStyle:"solid"},model:{value:e.model.status,callback:function(t){e.$set(e.model,"status",t)},expression:"model.status"}},[a("a-radio-button",{attrs:{value:"1"}},[e._v("有效")]),a("a-radio-button",{attrs:{value:"0"}},[e._v("无效")])],1)],1)],1)],1)],1)},l=[],s=a("0fea"),i={name:"PermissionDataRuleModal",data:function(){return{queryParam:{},title:"操作",visible:!1,model:{},ruleConditionList:[],labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},confirmLoading:!1,permissionId:"",validatorRules:{ruleConditions:[{required:!0,message:"请选择条件!"}],ruleName:[{required:!0,message:"请输入规则名称!"}],ruleValue:[{required:!0,message:"请输入规则值!"}],ruleColumn:[]},url:{list:"/sys/dictItem/list",add:"/sys/permission/addPermissionRule",edit:"/sys/permission/editPermissionRule"},showRuleColumn:!0}},created:function(){},methods:{add:function(e){this.permissionId=e,this.edit({status:"1"})},edit:function(e){this.model=Object.assign({},e),e.permissionId?this.model.permissionId=e.permissionId:this.model.permissionId=this.permissionId,this.visible=!0,this.initRuleCondition()},close:function(){this.$emit("close"),this.visible=!1,this.$refs.form.resetFields()},handleOk:function(){var e=this,t=this;this.$refs.form.validate((function(a){if(!a)return!1;t.confirmLoading=!0;var o="",l="";e.model.id?(o+=e.url.edit,l="put"):(o+=e.url.add,l="post"),Object(s["h"])(o,e.model,l).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok")):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1,t.close()}))}))},handleCancel:function(){this.close()},initRuleCondition:function(){this.model.ruleConditions&&"USE_SQL_RULES"==this.model.ruleConditions?this.showRuleColumn=!1:this.showRuleColumn=!0},handleChangeRuleCondition:function(e){"USE_SQL_RULES"==e?(this.model.ruleColumn="",this.showRuleColumn=!1):this.showRuleColumn=!0}}},r=i,n=a("2877"),c=Object(n["a"])(r,o,l,!1,null,"4d8b72ec",null);t["default"]=c.exports},ac8b:function(e,t,a){},b90e:function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-drawer",{attrs:{title:e.title,width:e.drawerWidth,visible:e.visible,confirmLoading:e.confirmLoading},on:{close:e.handleCancel}},[a("div",{style:{width:"100%",border:"1px solid #e9e9e9",padding:"10px 16px",background:"#fff"}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form-model",{ref:"form",attrs:{model:e.model,rules:e.validatorRules}},[a("a-form-model-item",{attrs:{label:"菜单类型",labelCol:e.labelCol,wrapperCol:e.wrapperCol}},[a("a-radio-group",{on:{change:e.onChangeMenuType},model:{value:e.model.menuType,callback:function(t){e.$set(e.model,"menuType",t)},expression:"model.menuType"}},[a("a-radio",{attrs:{value:0}},[e._v("一级菜单")]),a("a-radio",{attrs:{value:1}},[e._v("子菜单")]),a("a-radio",{attrs:{value:2}},[e._v("按钮/权限")])],1)],1),a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:e.menuLabel,prop:"name",hasFeedback:""}},[a("a-input",{attrs:{placeholder:"请输入菜单名称",readOnly:e.disableSubmit},model:{value:e.model.name,callback:function(t){e.$set(e.model,"name",t)},expression:"model.name"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:0!=e.model.menuType,expression:"model.menuType!=0"}],attrs:{label:"上级菜单",labelCol:e.labelCol,wrapperCol:e.wrapperCol,"validate-status":e.validateStatus,hasFeedback:!0,required:!0}},[a("span",{attrs:{slot:"help"},slot:"help"},[e._v(e._s("error"==e.validateStatus?"请选择上级菜单":"  "))]),a("a-tree-select",{staticStyle:{width:"100%"},attrs:{dropdownStyle:{maxHeight:"200px",overflow:"auto"},treeData:e.treeData,placeholder:"请选择父级菜单",disabled:e.disableSubmit},on:{change:e.handleParentIdChange},model:{value:e.model.parentId,callback:function(t){e.$set(e.model,"parentId",t)},expression:"model.parentId"}})],1),a("a-form-model-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"url",label:"菜单路径"}},[a("a-input",{attrs:{placeholder:"请输入菜单路径",readOnly:e.disableSubmit},model:{value:e.model.url,callback:function(t){e.$set(e.model,"url",t)},expression:"model.url"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"component",label:"前端组件"}},[a("a-input",{attrs:{placeholder:"请输入前端组件",readOnly:e.disableSubmit},model:{value:e.model.component,callback:function(t){e.$set(e.model,"component",t)},expression:"model.component"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:0==e.model.menuType,expression:"model.menuType==0"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"默认跳转地址"}},[a("a-input",{attrs:{placeholder:"请输入路由参数 redirect",readOnly:e.disableSubmit},model:{value:e.model.redirect,callback:function(t){e.$set(e.model,"redirect",t)},expression:"model.redirect"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:!e.show,expression:"!show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"perms",label:"授权标识"}},[a("a-input",{attrs:{placeholder:"请输入授权标识, 如: user:list",readOnly:e.disableSubmit},model:{value:e.model.perms,callback:function(t){e.$set(e.model,"perms",t)},expression:"model.perms"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:!e.show,expression:"!show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"授权策略"}},[a("j-dict-select-tag",{attrs:{placeholder:"请选择授权策略",type:"radio",dictCode:"global_perms_type"},model:{value:e.model.permsType,callback:function(t){e.$set(e.model,"permsType",t)},expression:"model.permsType"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:!e.show,expression:"!show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"状态"}},[a("j-dict-select-tag",{attrs:{placeholder:"请选择状态",type:"radio",dictCode:"valid_status"},model:{value:e.model.status,callback:function(t){e.$set(e.model,"status",t)},expression:"model.status"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"菜单图标"}},[a("a-input",{attrs:{placeholder:"点击选择图标",readOnly:e.disableSubmit},model:{value:e.model.icon,callback:function(t){e.$set(e.model,"icon",t)},expression:"model.icon"}},[a("a-icon",{attrs:{slot:"addonAfter",type:"setting"},on:{click:e.selectIcons},slot:"addonAfter"})],1)],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"sortNo",label:"排序"}},[a("a-input-number",{staticStyle:{width:"200px"},attrs:{placeholder:"请输入菜单排序",readOnly:e.disableSubmit},model:{value:e.model.sortNo,callback:function(t){e.$set(e.model,"sortNo",t)},expression:"model.sortNo"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"是否路由菜单"}},[a("a-switch",{attrs:{checkedChildren:"是",unCheckedChildren:"否"},model:{value:e.model.route,callback:function(t){e.$set(e.model,"route",t)},expression:"model.route"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"隐藏路由"}},[a("a-switch",{attrs:{checkedChildren:"是",unCheckedChildren:"否"},model:{value:e.model.hidden,callback:function(t){e.$set(e.model,"hidden",t)},expression:"model.hidden"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"是否缓存路由"}},[a("a-switch",{attrs:{checkedChildren:"是",unCheckedChildren:"否"},model:{value:e.model.keepAlive,callback:function(t){e.$set(e.model,"keepAlive",t)},expression:"model.keepAlive"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"聚合路由"}},[a("a-switch",{attrs:{checkedChildren:"是",unCheckedChildren:"否"},model:{value:e.model.alwaysShow,callback:function(t){e.$set(e.model,"alwaysShow",t)},expression:"model.alwaysShow"}})],1),a("a-form-model-item",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"打开方式"}},[a("a-switch",{attrs:{checkedChildren:"外部",unCheckedChildren:"内部"},model:{value:e.model.internalOrExternal,callback:function(t){e.$set(e.model,"internalOrExternal",t)},expression:"model.internalOrExternal"}})],1)],1),a("icons",{attrs:{iconChooseVisible:e.iconChooseVisible},on:{choose:e.handleIconChoose,close:e.handleIconCancel}})],1),a("a-row",{style:{textAlign:"right"}},[a("a-button",{style:{marginRight:"8px"},on:{click:e.handleCancel}},[e._v("\n        关闭\n      ")]),a("a-button",{attrs:{disabled:e.disableSubmit,type:"primary"},on:{click:e.handleOk}},[e._v("确定")])],1)],1)])},l=[],s=a("4ec3"),i=a("11cb"),r={name:"PermissionModal",components:{Icons:i["default"]},data:function(){return{drawerWidth:700,treeData:[],title:"操作",visible:!1,disableSubmit:!1,model:{},show:!0,menuLabel:"菜单名称",labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},confirmLoading:!1,iconChooseVisible:!1,validateStatus:""}},computed:{validatorRules:function(){return{name:[{required:!0,message:"请输入菜单标题!"}],component:[{required:this.show,message:"请输入前端组件!"}],url:[{required:this.show,message:"请输入菜单路径!"}],permsType:[{required:!0,message:"请输入授权策略!"}],perms:[{required:!1,message:"请输入授权标识!"},{validator:this.validatePerms}]}}},created:function(){},methods:{loadTree:function(){var e=this;Object(s["L"])().then((function(t){if(t.success){e.treeData=[];for(var a=t.result.treeList,o=0;o<a.length;o++){var l=a[o];l.isLeaf=l.leaf,e.treeData.push(l)}}}))},add:function(){this.edit({status:"1",permsType:"1",sortNo:1,route:!0,menuType:0})},edit:function(e){this.resetScreenSize(),this.model=Object.assign({},e),this.show=2!=e.menuType,this.menuLabel=2==e.menuType?"按钮/权限":"菜单名称",this.visible=!0,this.loadTree()},close:function(){this.$emit("close"),this.disableSubmit=!1,this.visible=!1,this.$refs.form.resetFields()},handleOk:function(){var e=this,t=this;this.$refs.form.validate((function(a){return!!a&&(1!=e.model.menuType&&2!=e.model.menuType||e.model.parentId?(t.validateStatus="success",t.confirmLoading=!0,o=e.model.id?Object(s["p"])(e.model):Object(s["c"])(e.model),void o.then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok")):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1,t.close()}))):(t.validateStatus="error",void t.$message.error("请检查你填的类型以及信息是否正确！")));var o}))},handleCancel:function(){this.close()},validateNumber:function(e,t,a){!t||new RegExp(/^[0-9]*[1-9][0-9]*$/).test(t)?a():a("请输入正整数!")},validatePerms:function(e,t,a){if(t&&t.length>0){var o={tableName:"sys_permission",fieldName:"perms",fieldVal:t,dataId:this.model.id};Object(s["m"])(o).then((function(e){e.success?a():a("授权标识已存在!")}))}else a()},onChangeMenuType:function(e){var t=this;2==this.model.menuType?(this.show=!1,this.menuLabel="按钮/权限"):(this.show=!0,this.menuLabel="菜单名称"),this.$nextTick((function(){t.$refs.form.validateField(["url","component"])}))},selectIcons:function(){this.iconChooseVisible=!0},handleIconCancel:function(){this.iconChooseVisible=!1},handleIconChoose:function(e){this.model.icon=e,this.iconChooseVisible=!1},resetScreenSize:function(){var e=document.body.clientWidth;this.drawerWidth=e<500?e:700},handleParentIdChange:function(e){this.validateStatus=e?"success":"error"}}},n=r,c=a("2877"),d=Object(c["a"])(n,o,l,!1,null,"020bf494",null);t["default"]=d.exports},cd6d:function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-card",{attrs:{bordered:!1}},[a("div",{staticClass:"table-operator"},[a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.handleAdd}},[e._v("新增")]),e.selectedRowKeys.length>0?a("a-button",{attrs:{ghost:"",type:"primary",icon:"delete"},on:{click:e.batchDel}},[e._v("批量删除\n    ")]):e._e()],1),a("div",[a("div",{staticClass:"ant-alert ant-alert-info",staticStyle:{"margin-bottom":"16px"}},[a("i",{staticClass:"anticon anticon-info-circle ant-alert-icon"}),e._v("已选择 "),a("a",{staticStyle:{"font-weight":"600"}},[e._v(e._s(e.selectedRowKeys.length))]),e._v("项  \n      "),a("a",{staticStyle:{"margin-left":"24px"},on:{click:e.onClearSelected}},[e._v("清空")])]),a("a-table",{attrs:{columns:e.columns,size:"middle",pagination:!1,dataSource:e.dataSource,loading:e.loading,expandedRowKeys:e.expandedRowKeys,rowSelection:{selectedRowKeys:e.selectedRowKeys,onChange:e.onSelectChange}},on:{expand:e.expandSubmenu,expandedRowsChange:e.handleExpandedRowsChange},scopedSlots:e._u([{key:"action",fn:function(t,o){return a("span",{},[a("a",{on:{click:function(t){return e.handleEdit(o)}}},[e._v("编辑")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-dropdown",[a("a",{staticClass:"ant-dropdown-link"},[e._v("\n            更多 "),a("a-icon",{attrs:{type:"down"}})],1),a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",[a("a",{attrs:{href:"javascript:;"},on:{click:function(t){return e.handleDetail(o)}}},[e._v("详情")])]),a("a-menu-item",[a("a",{attrs:{href:"javascript:;"},on:{click:function(t){return e.handleAddSub(o)}}},[e._v("添加下级")])]),a("a-menu-item",[a("a",{attrs:{href:"javascript:;"},on:{click:function(t){return e.handleDataRule(o)}}},[e._v("数据规则")])]),a("a-menu-item",[a("a-popconfirm",{attrs:{title:"确定删除吗?",placement:"topLeft"},on:{confirm:function(){return e.handleDelete(o.id)}}},[a("a",[e._v("删除")])])],1)],1)],1)],1)}},{key:"url",fn:function(e){return a("span",{},[a("j-ellipsis",{attrs:{value:e,length:25}})],1)}},{key:"component",fn:function(e){return a("span",{},[a("j-ellipsis",{attrs:{value:e}})],1)}}])})],1),a("permission-modal",{ref:"modalForm",on:{ok:e.modalFormOk}}),a("permission-data-rule-list",{ref:"PermissionDataRuleList",on:{ok:e.modalFormOk}})],1)},l=[],s=a("b90e"),i=a("4ec3"),r=a("b65a"),n=a("56cd1"),c=a("d579"),d=[{title:"菜单名称",dataIndex:"name",key:"name"},{title:"菜单类型",dataIndex:"menuType",key:"menuType",customRender:function(e){return 0==e||1==e?"菜单":2==e?"按钮/权限":e}},{title:"icon",dataIndex:"icon",key:"icon"},{title:"组件",dataIndex:"component",key:"component",scopedSlots:{customRender:"component"}},{title:"路径",dataIndex:"url",key:"url",scopedSlots:{customRender:"url"}},{title:"排序",dataIndex:"sortNo",key:"sortNo"},{title:"操作",dataIndex:"action",scopedSlots:{customRender:"action"},align:"center",width:150}],u={name:"PermissionListAsync",mixins:[r["a"]],components:{PermissionDataRuleList:n["default"],PermissionModal:s["default"],JEllipsis:c["default"]},data:function(){return{description:"这是菜单管理页面",columns:d,loading:!1,expandedRowKeys:[],url:{list:"/sys/permission/list",delete:"/sys/permission/delete",deleteBatch:"/sys/permission/deleteBatch"}}},methods:{loadData:function(){var e=this;this.loading=!0,Object(i["x"])().then((function(t){if(t.success)return e.dataSource=t.result,e.loadDataByExpandedRows(e.dataSource)})).finally((function(){e.loading=!1}))},expandSubmenu:function(e,t){!e||t.children&&0!==t.children.length||Object(i["y"])({parentId:t.id}).then((function(e){e.success&&(t.children=e.result)}))},loadDataByExpandedRows:function(e){var t=this;return this.expandedRowKeys.length>0?Object(i["z"])({parentIds:this.expandedRowKeys.join(",")}).then((function(a){if(a.success){var o=a.result,l=function e(a){a&&a.length>0&&a.forEach((function(a){t.expandedRowKeys.includes(a.id)&&(a.children=o[a.id],e(a.children))}))};l(e)}})):Promise.resolve()},handleDataRule:function(e){this.$refs.PermissionDataRuleList.edit(e)},handleAddSub:function(e){this.$refs.modalForm.title="添加子菜单",this.$refs.modalForm.disableSubmit=!1,this.$refs.modalForm.edit({status:"1",permsType:"1",route:!0,parentId:e.id,menuType:1})},handleExpandedRowsChange:function(e){this.expandedRowKeys=e}}},m=u,p=(a("db8e"),a("2877")),h=Object(p["a"])(m,o,l,!1,null,"fd05e872",null);t["default"]=h.exports},d90d:function(e,t,a){},db8e:function(e,t,a){"use strict";var o=a("ac8b"),l=a.n(o);l.a}}]);