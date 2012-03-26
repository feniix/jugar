package ar.jug.domain;

import java.util.Iterator;
import java.util.List;

/**
 * A search result object with pagination support.
 *
 * @author edgar.espina
 * @param <T> The result type.
 */
public class SearchResult<T> implements Iterable<T> {

  /**
   * The page index.
   */
  private int page;

  /**
   * The page's size.
   */
  private int pageSize;

  /**
   * The total results.
   */
  private int pages;

  /**
   * The result set.
   */
  private List<T> list;

  /**
   * Creates a new {@link SearchResult}.
   *
   * @param firstResult The first result index.
   * @param maxResults The max results index.
   * @param totalResults The total results.
   * @param list The result set.
   */
  public SearchResult(final int firstResult, final int maxResults,
      final int totalResults, final List<T> list) {
    this.page = firstResult;
    this.pageSize = maxResults;
    this.pages = totalResults;
    this.list = list;
  }

  /**
   * Creates a new {@link SearchResult}.
   *
   * @param list The result set.
   */
  public SearchResult(final List<T> list) {
    this(1, list.size(), list.size(), list);
  }

  /**
   * The page index.
   *
   * @return The page index.
   */
  public int getPage() {
    return page;
  }

  /**
   * The page's size.
   *
   * @return The page's size.
   */
  public int getPageSize() {
    return pageSize;
  }

  /**
   * The number of pages.
   *
   * @return The number of pages.
   */
  public int getPages() {
    return pages;
  }

  /**
   * The result set.
   *
   * @return The result set.
   */
  public List<T> getList() {
    return list;
  }

  /**
   * Return the result as a {@link Iterator}.
   *
   * @return The result as a {@link Iterator}.
   */
  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }

}
