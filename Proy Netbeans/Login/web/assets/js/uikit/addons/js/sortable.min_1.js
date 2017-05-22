/*! UIkit 2.3.1 | http://www.getuikit.com | (c) 2014 YOOtheme | MIT License */

(function(t,e,i,n){function s(e,n){var s=t(e);s.data("uksortable")||(this.w=t(i),this.el=s,this.options=t.extend({},t.fn.uksortable.defaults,n),this.tplempty='<div class="'+this.options.emptyClass+'"/>',this.el.find(">"+this.options.itemNodeName).addClass(this.options.listitemClass).end().find("ul:not(.ignore-list)").addClass(this.options.listClass).find(">li").addClass(this.options.listitemClass),this.el.children(this.options.itemNodeName).length||this.el.append(this.tplempty),this.el.data("uksortable",this),this.el.data("uksortable-id","ID"+(new Date).getTime()+"RAND"+Math.ceil(1e5*Math.random())),this.init())}var o="ontouchstart"in i,a=t("html"),r=[],l=function(){var t=n.createElement("div"),e=n.documentElement;if(!("pointerEvents"in t.style))return!1;t.style.pointerEvents="auto",t.style.pointerEvents="x",e.appendChild(t);var s=i.getComputedStyle&&"auto"===i.getComputedStyle(t,"").pointerEvents;return e.removeChild(t),!!s}(),u=o?"touchstart":"mousedown",d=o?"touchmove":"mousemove",h=o?"touchend":"mouseup",c=o?"touchcancel":"mouseup";s.prototype={init:function(){var e=this;e.reset(),e.el.data("uksortable-group",this.options.group),e.placeEl=t('<div class="'+e.options.placeClass+'"/>'),t.each(this.el.find(e.options.itemNodeName),function(i,n){e.setParent(t(n))}),e.el.on("click","[data-sortable-action]",function(i){if(!e.dragEl&&(o||0===i.button)){i.preventDefault();var n=t(i.currentTarget),s=n.data("sortableAction"),a=n.closest(e.options.itemNodeName);"collapse"===s&&e.collapseItem(a),"expand"===s&&e.expandItem(a),"toggle"===s&&e.toggleItem(a)}});var n=function(i){var n=t(i.target);if(!n.hasClass(e.options.handleClass)){if(n.closest("."+e.options.noDragClass).length)return;n=n.closest("."+e.options.handleClass)}!n.length||e.dragEl||!o&&0!==i.button||o&&1!==i.touches.length||(i.preventDefault(),e.dragStart(o?i.touches[0]:i))},s=function(t){e.dragEl&&(t.preventDefault(),e.dragMove(o?t.touches[0]:t))},a=function(t){e.dragEl&&(t.preventDefault(),e.dragStop(o?t.touches[0]:t))};o?(e.el[0].addEventListener(u,n,!1),i.addEventListener(d,s,!1),i.addEventListener(h,a,!1),i.addEventListener(c,a,!1)):(e.el.on(u,n),e.w.on(d,s),e.w.on(h,a))},serialize:function(){var e,i=0,n=this;return step=function(e,i){var s=[],o=e.children(n.options.itemNodeName);return o.each(function(){var e=t(this),o=t.extend({},e.data()),a=e.children(n.options.listNodeName);a.length&&(o.children=step(a,i+1)),s.push(o)}),s},e=step(n.el,i)},list:function(e){var i=[],n=this,s=0,e=t.extend({},n.options,e),o=function(n,s,a){var r=n.children(e.itemNodeName);r.each(function(n){var r=t(this),l=t.extend({parent_id:a?a:null,depth:s,order:n},r.data()),u=r.children(e.listNodeName);i.push(l),u.length&&o(u,s+1,r.data(e.idProperty||"id"))})};return o(n.el,s),i},reset:function(){this.mouse={offsetX:0,offsetY:0,startX:0,startY:0,lastX:0,lastY:0,nowX:0,nowY:0,distX:0,distY:0,dirAx:0,dirX:0,dirY:0,lastDirX:0,lastDirY:0,distAxX:0,distAxY:0},this.moving=!1,this.dragEl=null,this.dragRootEl=null,this.dragDepth=0,this.hasNewRoot=!1,this.pointEl=null;for(var t=0;r.length>t;t++)r[t].children().length||r[t].append(this.tplempty);r=[]},toggleItem:function(t){this[t.hasClass(this.options.collapsedClass)?"expandItem":"collapseItem"](t)},expandItem:function(t){t.removeClass(this.options.collapsedClass)},collapseItem:function(t){var e=t.children(this.options.listNodeName);e.length&&t.addClass(this.options.collapsedClass)},expandAll:function(){var e=this;e.el.find(e.options.itemNodeName).each(function(){e.expandItem(t(this))})},collapseAll:function(){var e=this;e.el.find(e.options.itemNodeName).each(function(){e.collapseItem(t(this))})},setParent:function(t){t.children(this.options.listNodeName).length&&t.addClass("uk-parent")},unsetParent:function(t){t.removeClass("uk-parent "+this.options.collapsedClass),t.children(this.options.listNodeName).remove()},dragStart:function(e){var i=this.mouse,s=t(e.target),o=s.closest(this.options.itemNodeName),r=o.offset();this.placeEl.css("height",o.height()),i.offsetX=e.pageX-r.left,i.offsetY=e.pageY-r.top,i.startX=i.lastX=r.left,i.startY=i.lastY=r.top,this.dragRootEl=this.el,this.dragEl=t(n.createElement(this.options.listNodeName)).addClass(this.options.listClass+" "+this.options.dragClass),this.dragEl.css("width",o.width()),this.tmpDragOnSiblings=[o[0].previousSibling,o[0].nextSibling],o.after(this.placeEl),o[0].parentNode.removeChild(o[0]),o.appendTo(this.dragEl),t(n.body).append(this.dragEl),this.dragEl.css({left:r.left,top:r.top});var l,u,d=this.dragEl.find(this.options.itemNodeName);for(l=0;d.length>l;l++)u=t(d[l]).parents(this.options.listNodeName).length,u>this.dragDepth&&(this.dragDepth=u);a.addClass(this.options.movingClass)},dragStop:function(){var t=this.dragEl.children(this.options.itemNodeName).first();t[0].parentNode.removeChild(t[0]),this.placeEl.replaceWith(t),this.dragEl.remove(),(this.tmpDragOnSiblings[0]!=t[0].previousSibling||this.tmpDragOnSiblings[0]!=t[0].previousSibling)&&(this.el.trigger("sortable-change",[t,this.hasNewRoot?"added":"moved"]),this.hasNewRoot&&this.dragRootEl.trigger("sortable-change",[t,"removed"])),this.reset(),a.removeClass(this.options.movingClass)},dragMove:function(e){var s,o,a,u,d,h=this.options,c=this.mouse;this.dragEl.css({left:e.pageX-c.offsetX,top:e.pageY-c.offsetY}),c.lastX=c.nowX,c.lastY=c.nowY,c.nowX=e.pageX,c.nowY=e.pageY,c.distX=c.nowX-c.lastX,c.distY=c.nowY-c.lastY,c.lastDirX=c.dirX,c.lastDirY=c.dirY,c.dirX=0===c.distX?0:c.distX>0?1:-1,c.dirY=0===c.distY?0:c.distY>0?1:-1;var f=Math.abs(c.distX)>Math.abs(c.distY)?1:0;if(!c.moving)return c.dirAx=f,c.moving=!0,undefined;c.dirAx!==f?(c.distAxX=0,c.distAxY=0):(c.distAxX+=Math.abs(c.distX),0!==c.dirX&&c.dirX!==c.lastDirX&&(c.distAxX=0),c.distAxY+=Math.abs(c.distY),0!==c.dirY&&c.dirY!==c.lastDirY&&(c.distAxY=0)),c.dirAx=f,c.dirAx&&c.distAxX>=h.threshold&&(c.distAxX=0,a=this.placeEl.prev(h.itemNodeName),c.distX>0&&a.length&&!a.hasClass(h.collapsedClass)&&(s=a.find(h.listNodeName).last(),d=this.placeEl.parents(h.listNodeName).length,d+this.dragDepth<=h.maxDepth&&(s.length?(s=a.children(h.listNodeName).last(),s.append(this.placeEl)):(s=t("<"+h.listNodeName+"/>").addClass(h.listClass),s.append(this.placeEl),a.append(s),this.setParent(a)))),0>c.distX&&(u=this.placeEl.next(h.itemNodeName),u.length||(o=this.placeEl.parent(),this.placeEl.closest(h.itemNodeName).after(this.placeEl),o.children().length||this.unsetParent(o.parent()))));var p=!1;if(l||(this.dragEl[0].style.visibility="hidden"),this.pointEl=t(n.elementFromPoint(e.pageX-n.body.scrollLeft,e.pageY-(i.pageYOffset||n.documentElement.scrollTop))),l||(this.dragEl[0].style.visibility="visible"),this.pointEl.hasClass(h.handleClass))this.pointEl=this.pointEl.closest(h.itemNodeName);else{var m=this.pointEl.closest("."+h.itemClass);m.length&&(this.pointEl=m.closest(h.itemNodeName))}if(this.pointEl.hasClass(h.emptyClass))p=!0;else if(this.pointEl.data("uksortable")&&!this.pointEl.children().length)p=!0,this.pointEl=t(this.tplempty).appendTo(this.pointEl);else if(!this.pointEl.length||!this.pointEl.hasClass(h.listitemClass))return;var g=this.el,v=this.pointEl.closest("."+this.options.listBaseClass),k=g[0]!==this.pointEl.closest("."+this.options.listBaseClass)[0],w=v;if(!c.dirAx||k||p){if(k&&h.group!==w.data("uksortable-group"))return;if(r.push(g),d=this.dragDepth-1+this.pointEl.parents(h.listNodeName).length,d>h.maxDepth)return;var y=e.pageY<this.pointEl.offset().top+this.pointEl.height()/2;o=this.placeEl.parent(),p?this.pointEl.replaceWith(this.placeEl):y?this.pointEl.before(this.placeEl):this.pointEl.after(this.placeEl),o.children().length||o.data("uksortable")||this.unsetParent(o.parent()),this.dragRootEl.find(h.itemNodeName).length||this.dragRootEl.children().length||this.dragRootEl.append(this.tplempty),k&&(this.dragRootEl=v,this.hasNewRoot=this.el[0]!==this.dragRootEl[0])}}},t.fn.uksortable=function(e){var i=this,n=this;return i.each(function(){var i=t(this),o=i.data("uksortable");o?"string"==typeof e&&"function"==typeof o[e]&&(n=o[e]()):o=new s(i,e)}),n||i},t.fn.uksortable.defaults={prefix:"uk",listNodeName:"ul",itemNodeName:"li",listBaseClass:"{prefix}-sortable",listClass:"{prefix}-sortable-list",listitemClass:"{prefix}-sortable-list-item",itemClass:"{prefix}-sortable-item",dragClass:"{prefix}-sortable-list-dragged",movingClass:"{prefix}-sortable-moving",handleClass:"{prefix}-sortable-handle",collapsedClass:"{prefix}-collapsed",placeClass:"{prefix}-sortable-placeholder",noDragClass:"{prefix}-sortable-nodrag",emptyClass:"{prefix}-sortable-empty",group:0,maxDepth:10,threshold:20},t(n).on("uk-domready",function(){t("[data-uk-sortable]").each(function(){var i=t(this),n=t.extend({},t.fn.uksortable.defaults,e.Utils.options(i.attr("data-uk-sortable")));Object.keys(n).forEach(function(t){-1!=(n[t]+"").indexOf("{prefix}")&&(n[t]=n[t].replace("{prefix}",n.prefix))}),i.data("uksortable")||i.uksortable(n)})})})(window.jQuery,jQuery.UIkit,window,document);