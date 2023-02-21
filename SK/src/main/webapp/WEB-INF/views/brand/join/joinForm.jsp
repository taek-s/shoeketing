<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container" style="width: 600px">
      <div class="box-shadow-full" style="margin-top: 100px">
        <form id="joinForm" class="php-email-form">
          <div class="row mb-4 text-center">
            <h1>SHOEKETING</h1>
            <h6>(브랜드회원)</h6>
          </div>
          <div class="row">
            <div class="mb-3">
              <label
                for="BRAND_ID"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >아이디</label
              >
              <input
                class="form-control"
                type="text"
                id="BRAND_ID"
                name="BRAND_ID"
                required
              />
            </div>

            <div class="mb-3">
              <label
                for="BRAND_PW"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >비밀번호*</label
              >
              <input
                type="password"
                class="form-control"
                id="BRAND_PW"
                name="BRAND_PW"
                required
              />
            </div>

            <div class="mb-3">
              <label
                for="BRAND_PW2"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >비밀번호 확인*</label
              >
              <input
                type="password"
                class="form-control"
                id="BRAND_PW2"
                name="BRAND_PW2"
                required
              />
            </div>

            <div class="mb-3">
              <label
                for="BRAND_NAME"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >브랜드명</label
              >
              <input
                class="form-control"
                type="text"
                id="BRAND_NAME"
                name="BRAND_NAME"
                required
              />
            </div>

            <div class="mb-3">
              <label
                for="BRAND_BUSINESS_NUM"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >사업자 등록번호</label
              >
              <div class="d-flex">
                <input
                  class="form-control"
                  type="text"
                  id="BRAND_BUSINESS_NUM"
                  name="BRAND_BUSINESS_NUM"
                  placeholder="사업자 등록번호 입력"
                  required
                />

                <button
                  id="button-addon2"
                  class="btn btn-outline-primary"
                  type="button"
                  style="font-size: 12px; width: 200px"
                >
                  사업자 등록번호 확인
                </button>
              </div>
            </div>

            <div class="mb-3">
              <label
                for="BRAND_ADD"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >등록지 주소</label
              >
              <input
                class="form-control"
                type="text"
                id="BRAND_ADD"
                name="BRAND_ADD"
                required
              />
            </div>

            <div class="mb-3">
              <label
                for="BRAND_LOGO_FILE"
                class="form-label"
                style="font-size: large; font-weight: bolder"
                >브랜드 로고 파일</label
              >
              <input class="form-control" type="file" id="BRAND_LOGO_FILE">
            </div>
          </div>

          <hr class="my-4" />
          <button
            class="btn btn-primary btn-lg"
            style="margin-left: 30%; width: 45%"
            type="submit"
          >
            가입하기
          </button>
        </form>
      </div>
    </div>
</body>
</html>