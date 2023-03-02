<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:choose>
          <c:when test="${fn:length(list)>0}">
          	<c:forEach items="${list}" var="goods">
          <div class="card" style="width: 14rem; margin-left: 10px; margin-right: 10px; margin-bottom: 80px; border-style: none;">
              <a href="#" name="title" data-num="${goods.TOTAL_GOODS_NUM }">
                <img src="<%=request.getContextPath() %>/assets/img/a7ae62bb0c3243a2af834df70e9b0d81.jpg" style="width:13rem; height: 11rem" class="card-img-top" alt="<%=request.getContextPath() %>.">
                <div class="card-body" style="height:6rem;">
                  <h6 class="card-title" style="font-size: 15px; font-weight: 700;">${goods.BRAND_NAME}</h6>
                  <p class="card-text" style="font-size: 13px;">${goods.TOTAL_GOODS_NAME} / ${goods.TOTAL_GOODS_MODEL}</p>
                </div>
                <div class="card-body">
                  <h6 class="card-title mb-0" style="font-size: 18px; font-weight: 700;"><fmt:formatNumber value="${goods.TOTAL_GOODS_PRICE }" type="number"/>원</h6>
                </div>
              </a>
            </div>
           </c:forEach>
          </c:when>
          <c:otherwise>
          등록된 상품이 없습니다.
          </c:otherwise>
         </c:choose> 