package sk.item.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sk.common.dao.AbstractDAO;

@Repository("goodsDAO")
public class GoodsDAO extends AbstractDAO {

	// 브랜드 전체 상품 리스트 selectBrandGoodsList
	
	// 브랜드 전체 상품 토탈 개수  selectBrandGoodsCount
	
	// 브랜드 상품 등록 insertGoods
	
	// 상품 등록시, 상품 상세(사이즈) 삽입 insertGoodsDetail
	
	// 상품 등록시, 상품 이미지 삽입   insertGoodsImage
	
	// 브랜드 상품 상세조회 selectGoodsDetail
	
	// 상품 이미지 삭제 deleteGoodsImage
	
	// 상품 이미지 수정  updateGoodsImageModify
	
	// 상품 수정 (상품 상세정보 수정,사이즈만 따로)  updateGoodsModify
	
	// 상품 상세 삭제(상품 수정시, 원래 선택되어 있던 사이즈 전체 삭제)
	
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectAllGoodsList(Map<String, Object> map) throws Exception {
		System.out.println("allGoodsList : " + map);
		return (List<Map<String, Object>>) selectList("goods.selectAllGoodsList", map);
	}

	public int selectAllGoodsCount(Map<String, Object> map) throws Exception {
		System.out.println("selectAllGoodsCount : " + map);
		return (int) selectOne("goods.selectAllGoodsCount", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectAllBrandList(Map<String, Object> map) throws Exception {
		System.out.println("selectAllBrandList : " + map);
		return (List<Map<String, Object>>) selectList("goods.selectAllBrandList", map);
	}

	public int selectGoodsLike(Map<String, Object> map) throws Exception {
		System.out.println("selectGoodsLike : " + map);
		return (int) selectOne("goods.selectGoodsLike", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBrandDetail(Map<String, Object> map) throws Exception {
		System.out.println("selectBrandDetail : " + map);
		return (Map<String, Object>) selectOne("goods.selectBrandDetail", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectGoodsDetail(Map<String, Object> map) throws Exception {
		System.out.println("selectGoodsDetail : " + map);
		return (List<Map<String, Object>>) selectList("goods.selectGoodsDetail", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectGoodsImage(Map<String, Object> map) throws Exception {
		System.out.println("selectGoodsDetail : " + map);
		return (List<Map<String, Object>>) selectList("goods.selectGoodsImage", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectReviewDetail(Map<String, Object> map) throws Exception {
		System.out.println("selectReviewDetail : " + map);
		return (List<Map<String, Object>>) selectList("goods.selectReviewDetail", map);
	}

	public int selectReviewCount(Map<String, Object> map) throws Exception {
		System.out.println("selectReviewCount : " + map);
		return (int) selectOne("goods.selectReviewCount", map);
	}

	public int insertGoodsLike(Map<String, Object> map) throws Exception {
		System.out.println("insertGoodsLike : " + map);
		return (int) insert("goods.insertGoodsLike", map);
	}

	public int deleteGoodsLike(Map<String, Object> map) throws Exception {
		System.out.println("deleteGoodsLike : " + map);
		return (int) delete("goods.deleteGoodsLike", map);
	}

	public int updateGoodsLikeCountIncrease(Map<String, Object> map) throws Exception {
		System.out.println("updateGoodsLikeCountIncrease : " + map);
		return (int) update("goods.updateGoodsLikeCountIncrease", map);
	}

	public int updateGoodsLikeCountDecrease(Map<String, Object> map) throws Exception {
		System.out.println("updateGoodsLikeCountDecrease : " + map);
		return (int) update("goods.updateGoodsLikeCountDecrease", map);
	}
}
