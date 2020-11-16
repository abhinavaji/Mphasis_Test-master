/*
 * package com.banking.test;
 * 
 * import static org.mockito.Mockito.when; import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import java.util.Arrays; import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.web.servlet.MockMvc;
 * 
 * import com.banking.VO.SectorVO; import com.banking.entity.FinancialDtl;
 * import com.banking.service.CreditExposureService;
 * 
 * RunWith(SpringRunner.class)
 * 
 * @WebMvcTest public class CreditExposureTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @MockBean private CreditExposureService creditExposureService;
 * 
 * @Test public void findAll() throws Exception { SectorVO sectorVO = new
 * SectorVO();
 * 
 * List<SectorVO> sectorVOs = Arrays.asList(sectorVO);
 * when(creditExposureService.findAllSectors(5))).willReturn(sectorVOs);
 * 
 * this.mockMvc.perform(get("/api/products/filter/size/M")).andExpect(status().
 * isOk()) .andExpect(content().
 * json("[{'id': 1,'name': 'Stock 1';'quantity': 1;'size'}]")); }
 * 
 * }
 */